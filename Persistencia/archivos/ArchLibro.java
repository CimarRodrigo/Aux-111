package archivos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ArchLibro {
    private String nomArch;
    private RegLibro rLib;
    
    public ArchLibro(String nom){
        this.nomArch = nom;
    }
    
    public void Crear() throws FileNotFoundException, IOException{
        File ju = new File(this.nomArch);
        Scanner in = new Scanner(System.in);
        if (!ju.exists()) {
             ObjectOutputStream archivo = new ObjectOutputStream (new FileOutputStream(this.nomArch));
            archivo.close();
        }else{
            System.out.println("Archivo existente. Sobreescribir?");
            String op = in.nextLine();
            if (op.equals("si")){
                ObjectOutputStream archivo = new ObjectOutputStream (new FileOutputStream(this.nomArch));
            archivo.close();
            }
        }
       
        
    }
    
    public void Agregar() throws FileNotFoundException, IOException{
        File f1 = new File(this.nomArch);
        if (f1.exists()){
            ObjectOutputStream copiaArch = new ObjectOutputStream( new FileOutputStream("ArchivoCopia.txt"));
            ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(this.nomArch));
            try {
                while (true) {                    
                    this.rLib = (RegLibro)archivo.readObject();
                    copiaArch.writeObject(this.rLib);
                }
            } catch (Exception e) {
                RegLibro nLibro = new RegLibro();
                nLibro.leer();
                copiaArch.writeObject(nLibro);
                
                copiaArch.close();
                archivo.close();
                
                File f2 = new File("archivoCopia.txt");
                f1.delete();
                f2.renameTo(f1);
                System.out.println("Agregado");
            }
        }else{
            System.out.println("El archivo no existe");
        }
    }
    
    public void Eliminar(String cod) throws FileNotFoundException, IOException {
        System.out.println("\nEliminando");
        ObjectOutputStream copiaArch = new ObjectOutputStream( new FileOutputStream("archivoCopia.txt"));
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(this.nomArch));
        
        try {
            while (true) {                
                this.rLib = (RegLibro)archivo.readObject();
                if(!(this.rLib.getCod()).equals(cod))
                    copiaArch.writeObject(this.rLib);
            }
        } catch (Exception e) {
            copiaArch.close();
            archivo.close();
            
            File f1 = new File(this.nomArch);
            File f2 = new File("archivoCopia.txt");
            f1.delete();
            f2.renameTo(f1);
        }
    }
    
    public void Modificar(String codi) throws FileNotFoundException, IOException{
        ObjectOutputStream copiaArch = new ObjectOutputStream( new FileOutputStream("archivoCopia.txt"));
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(this.nomArch));
        System.out.println("\nModificando");
        try {
            while (true) {                
                this.rLib = (RegLibro)archivo.readObject();
                if (this.rLib.getCod().equals(codi)) {
                    this.rLib.leer();
                }
                
                copiaArch.writeObject(this.rLib);
            }
        } catch (Exception e) {
            copiaArch.close();
            archivo.close();
            
            File f1 = new File(this.nomArch);
            File f2 = new File("archivoCopia.txt");
            f1.delete();
            f2.renameTo(f1);
        }
    }
    
    public void Listar() throws FileNotFoundException, IOException{
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(this.nomArch));
        
        try {
            while (true) {                
                this.rLib = (RegLibro)archivo.readObject();
                this.rLib.Mostrar();
                
            }
        } catch (Exception e) {
            
            archivo.close();    
        }
        
    }
    
    public  void ListarLibrosPrecioMayor() throws FileNotFoundException, IOException{
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(this.nomArch));
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrece precio X");
        double prex = input.nextDouble();
        try {
            while (true) {                
                
                this.rLib = (RegLibro)archivo.readObject();
                if (this.rLib.getPrecio() > prex) {
                    this.rLib.Mostrar();
                }
            }
        } catch (Exception e) {
            archivo.close();
        }
    }
    
    public void MontoTotal() throws FileNotFoundException, IOException{
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(this.nomArch));
        double s = 0;
        try {
            while (true) {                
                this.rLib = (RegLibro)archivo.readObject();
                s =  (s + this.rLib.getPrecio());
            }
            
            
        } catch (Exception e) {
            System.out.println("El monto total es: " + s);
            archivo.close();
        }
        
    }
    
    public void MostrarLibroSubCadena(String x) throws FileNotFoundException, IOException{
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(this.nomArch));
        System.out.println("\nMostrando libros que contengan " + x);
        
        try {
            while (true) {
                this.rLib = (RegLibro)archivo.readObject();                
                if (this.rLib.getTitulo().contains(x)) {
                    this.rLib.Mostrar();
                }
            }
        } catch (Exception e) {
            archivo.close();
        }
    }
    
    public void MostrarArchivoConLibrosMayorAX(ArchLibro a2) throws FileNotFoundException, IOException{
        ObjectInputStream archivo1 = new ObjectInputStream(new FileInputStream(this.nomArch));
        ObjectInputStream archivo2 = new ObjectInputStream(new FileInputStream(a2.nomArch));
        Scanner input = new Scanner(System.in);
        System.out.println("\nComparando 2 archivos");
        System.out.println("Ingrese precio X:");
        double pre = input.nextDouble();
        int c1 = 0, c2 = 0;
        try {
            while (true) {                
                this.rLib = (RegLibro)archivo1.readObject();
                a2.rLib = (RegLibro)archivo2.readObject();
               
                if (this.rLib.getPrecio() > pre) {
                    c1++;
                }
                if (a2.rLib.getPrecio() > pre){
                    c2++;
                }
            }
        } catch (Exception e) {
            if (c1 > c2) {
                System.out.println("Archivo con mas libros con precio mayor a " + pre + " es: " + this.nomArch);
                this.Listar();
            }else if(c2 > c1){
                System.out.println("Archivo con mas libros con precio mayor a " + pre + " es: " + a2.nomArch);
                a2.Listar();
            }else{
                System.out.println("Ambos archivos tienen la misma cantidad de libros con precio mayor a " + pre);
            }
            archivo1.close();
            archivo2.close();
        }
        
    }
    
}
