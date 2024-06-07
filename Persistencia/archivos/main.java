package archivos;

import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {
        
        ArchLibro a = new ArchLibro("Libro.dat");
        ArchLibro a2 = new ArchLibro("Libro2.dat");
        Scanner input = new Scanner(System.in);
        String op;
        a.Crear();
        a2.Crear();
        do {            
            System.out.println("\nMenu Archivo Libro");
            System.out.println("1: Adicionar"
                    + "\n2: Eliminar"
                    + "\n3: Modificar"
                    + "\n4: Listar"
                    + "\n5: Listar Libros con precio mayor a X"
                    + "\n6: Mostrar Precio Total"
                    + "\n7: Mostrar Libros que contengan Pro"
                    + "\n8: Adicionar a Archivo2"
                    + "\n9: Comparar que archivo tiene mas libros con precio mayor a X"
                    + "\n10: Salir");
            op = input.nextLine();
            switch(op){
                case "1":
                    a.Agregar();
                    break;
                case "2":
                    String code = input.nextLine();
                    a.Eliminar(code);
                    break;
                case "3":
                    String cod = input.nextLine();
                    a.Modificar(cod);
                    break;
                case "4":
                    
                    a.Listar();
                    break;
                case "5":
                    a.ListarLibrosPrecioMayor();
                    break;
                case "6":
                    a.MontoTotal();
                    break;
                case "7":
                    a.MostrarLibroSubCadena("Pro");
                    break;
                case "8":                    
                    a2.Agregar();
                    break;
                case "9":
                    a.MostrarArchivoConLibrosMayorAX(a2);
                    break;
                case "10":
                    System.out.println("Fin del programa");
                    break;
                default: System.out.println("Opcion invalida!");
            }
        } while (!(op).equals("10"));
       
    }
    
}
