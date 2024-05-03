package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, tam;
		String x = sc.nextLine();
		String[] a = x.split(" ");
		String aux;
		int numero;
		tam = a.length;
		
		for(i = 0; i < tam; i++) {
			aux = a[i].substring(0, 1);
			numero = Integer.parseInt(aux);
			aux = a[i].substring(1, 2);
			for(int j = 1; j <= numero; j++) {
				System.out.print(aux);
			}
			System.out.print(" ");
			
		}
		
		
	}

}
