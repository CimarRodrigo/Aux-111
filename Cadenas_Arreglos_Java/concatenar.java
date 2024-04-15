package Cadenas_Arreglos_Java;

import java.util.Arrays;

public class concatenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String cadena = "CADENA hola buenas";
		String aux = "";
		
		String a = "123456789789789";
		
		if(cadena.equals("CADENA hola buenas")) {// compara directamente
			System.out.println("CADENAS IGUALES");
		}
		
		String[] arrString = cadena.split(" "); // separa cadenas
		int cont = arrString.length; // tam de la cadena
		System.out.println(Arrays.toString(arrString)); // mostrar un arreglo directamente
		for(i = 1; i <= a.length(); i++) {
			aux = a.substring(i-1, i) + aux;
		}
		
		System.out.println(aux);
		
	}

}
