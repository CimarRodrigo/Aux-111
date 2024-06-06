package persistencia1;

import java.io.IOException;
import java.util.Scanner;
public class PrincipalArchiAlumno {
	 public static void main(String[] args)
	 {
	  int op,num;
	  ArchiAlumno AA = new ArchiAlumno("Alumno2.dat");
	  Alumno A = new Alumno();
	  try
	  {   do
	   {
	    System.out.println("\n \t\tMENU ALUMNO ");
	    System.out.println(" 1: ADICIONAR ALUMNO ");
	    System.out.println(" 2: MOSTRAR ALUMNOS ");
	    System.out.println(" 3: CONSULTA SEGUN COD ");
	    System.out.println(" 4: CONSULTA SOLO MUJERES ");
	    System.out.println(" 5: ELIMINAR UN ALUMNO ");
	    System.out.println(" 6: Edad de los ALUMNOS ");
	    System.out.println(" 7: SALIR ");
	    System.out.println(" Intro Opcion ");
	    op = Leer.datoInt();
	    
	    switch(op)
	    {
	     case 1: System.out.println("En Adicionar ");
	       A.leer();
	       AA.adicionar(A.obtc(), A.obtp(), A.obtm(), A.obtn(), A.obts(),A.obta());
	       break;
	     case 2: 
	       AA.mostrar();
	       break;
	     case 3: System.out.println("Intro cod a buscar ");
	       num=Leer.datoInt();
	       AA.buscarcod(num);
	       break;
	     case 4: AA.consulmuj(0);
	       break;
	     case 5: System.out.println("Intro cod a eliminar ");
	       num=Leer.datoInt();
	       AA.eliminar(num);
	       break;
	     case 6: 
		       AA.varonmayor();
		       break;
	    }
	   }while(op<=6);
	   System.out.println(" CHAUUUU... ");
	  }
	  catch(IOException e){}
	 }
}