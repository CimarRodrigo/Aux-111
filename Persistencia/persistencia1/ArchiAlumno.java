package persistencia1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class ArchiAlumno {
	private
	  String nomarch="";
	 public
	  ArchiAlumno()
	  { nomarch="";
	  }
	  ArchiAlumno(String x)
	  { nomarch=x;
	  }
	  void adicionar(int a,String b, String c, String d, int e, int f) throws IOException
	  { 
	   DataOutputStream Archi = null;
	   try
	   {
	    Archi = new DataOutputStream( new FileOutputStream("../"+nomarch,true));
	    Archi.writeInt(a);
	    Archi.writeUTF(b);
	    Archi.writeUTF(c);
	    Archi.writeUTF(d);
	    Archi.writeInt(e);
	    Archi.writeInt(f);
	    Archi.close();
	   }
	   catch(FileNotFoundException fnfe) {System.out.println("error "+fnfe);}
	   catch (IOException ioe) { System.out.println("error 1"+ioe);}
	  }
	  void mostrar() throws IOException
	  { 
	   DataInputStream Archi = null;
	   //int suma=0,cont=0;
	   //double promedio=0; //promedio edad
	   try
	   { //Alumno A = new Alumno();
	    Archi = new DataInputStream( new FileInputStream("../"+nomarch) );
	    System.out.println("COD\t PATER  \tMATER \tNOMBRE \tSEXO \tANAC");
	    while (true)
	    {   Alumno A = new Alumno();
	     A.ponc(Archi.readInt());
	     A.ponp(Archi.readUTF());
	     A.ponm(Archi.readUTF());
	     A.ponn(Archi.readUTF());
	     A.pons(Archi.readInt());
	     A.pona(Archi.readInt());	     
	     A.mostrar();
	    }
	   }
	   catch(FileNotFoundException fnfe) {}
	   catch (IOException ioe) {}
	   Archi.close();
	  }
	  void buscarcod(int x) throws IOException
	  { 
	   DataInputStream Archi = null;
	   try
	   {
	    Archi = new DataInputStream( new FileInputStream("../"+nomarch) );
	    System.out.println("COD\t PATER\tMATER\tNOMBRE \tSEXO \tANAC");
	    while (true)
	    { Alumno A = new Alumno();
	    A.ponc(Archi.readInt());
	     A.ponp(Archi.readUTF());
	     A.ponm(Archi.readUTF());
	     A.ponn(Archi.readUTF());
	     A.pons(Archi.readInt());
	     A.pona(Archi.readInt());
	     if (A.obtc()==x)
	     {
	      A.mostrar();
	     }
	    }
	   }
	   catch(FileNotFoundException fnfe) {}
	   catch (IOException ioe) {}
	   Archi.close();
	  }
	  void consulmuj(int x) throws IOException
	  { 
	   DataInputStream Archi = null;
	   try
	   {
	    Archi = new DataInputStream( new FileInputStream("../"+nomarch) );
	    System.out.println("COD\t PATER\tMATER\tNOMBRE \tSEXO \tANAC");
	    while (true)
	    {
	     Alumno A = new Alumno();
	     A.ponc(Archi.readInt());
	     A.ponp(Archi.readUTF());
	     A.ponm(Archi.readUTF());
	     A.ponn(Archi.readUTF());
	     A.pons(Archi.readInt());
	     A.pona(Archi.readInt());
	     if (A.obts()==x)
	     {
	      A.mostrar();
	     }
	    }
	   }
	   catch(FileNotFoundException fnfe) {}
	   catch (IOException ioe) {}
	   Archi.close();
	  }
	  void eliminar(int x) throws IOException
	  { 
	   DataInputStream Archi = null;
	   DataOutputStream ArchiTemp = null;
	   try
	   { ArchiTemp = new DataOutputStream( new FileOutputStream("../temporal2.dat",true ) );
	    Archi = new DataInputStream( new FileInputStream("../"+nomarch) );
	    
	    while (true)
	    {
	     Alumno A = new Alumno();
	     A.ponc(Archi.readInt());
	     A.ponp(Archi.readUTF());
	     A.ponm(Archi.readUTF());
	     A.ponn(Archi.readUTF());
	     A.pons(Archi.readInt());
	     A.pona(Archi.readInt());
	     if (A.obtc()!=x)
	     { 
	      ArchiTemp.writeInt(A.obtc());
	      ArchiTemp.writeUTF(A.obtp());
	      ArchiTemp.writeUTF(A.obtm());
	      ArchiTemp.writeUTF(A.obtn());
	      ArchiTemp.writeInt(A.obts());
	      ArchiTemp.writeInt(A.obta());
	     }
	     
	    }
	   }
	   catch(FileNotFoundException fnfe) {}
	   catch (IOException ioe) {}
	   try
	   {
	    Archi.close();
	    ArchiTemp.close();
	    File file1 = new File("../"+nomarch);
	    File file2 = new File("../temporal2.dat");
	    if (file1.exists()){  file1.delete();}
	    file2.renameTo(file1);
	   }
	   catch(IOException var){ System.out.println(" error ");}
	  }
	  void modificar(int x) throws IOException
	  {}
	  //void varonmayor() throws IOException
	  //{}
	  void varonmayor() throws IOException
	  { 
	   DataInputStream Archi = null;
	   int may=0;
	   try
	   { //Alumno A = new Alumno();
	    Archi = new DataInputStream( new FileInputStream("../"+nomarch) );
	    System.out.println("COD\t PATER  \tMATER \tNOMBRE \tSEXO \tANAC");
	    while (true)
	    {   Alumno A = new Alumno();
	     A.ponc(Archi.readInt());
	     A.ponp(Archi.readUTF());
	     A.ponm(Archi.readUTF());
	     A.ponn(Archi.readUTF());
	     A.pons(Archi.readInt());
	     A.pona(Archi.readInt());	     
	     A.mostrar();
	     System.out.println("Edad = "+A.edad());
	    }
	   }
	   catch(FileNotFoundException fnfe) {}
	   catch (IOException ioe) {}
	   Archi.close();
	  }
}
