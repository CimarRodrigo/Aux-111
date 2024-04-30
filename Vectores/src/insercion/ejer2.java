package insercion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ejer2 {
	public static String[] a = new String[10];
	
	static void llenar(int n) {
		int i;
		a[0] = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Llenando arreglo a");

		for (i = 1; i <= n; i++) {
			System.out.println("Ingrese una palabra para agregar al arreglo: ");
			a[i] = sc.nextLine();

		}

	}

	static void mostrar(int n) {
		int i;
		System.out.println("Mostrando arreglo a");

		for (i = 1; i <= n; i++) {
			System.out.println("Elemento " + "[" + i + "] = " + a[i]);
		}

	}

	static void insercion(int n) {
		int i, k;
		String x = "";

		for (i = 2; i <= n; i++) {
			k = i;
			
			while (a[k].compareTo(a[k-1]) < 0 && k >= 2) {
				
				x = a[k];
				a[k] = a[k - 1];
				a[k - 1] = x;

				k = k - 1;
				//System.out.println(Arrays.toString(a));
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un n: ");
		n = sc.nextInt();

		llenar(n);
		mostrar(n);
		insercion(n);
		mostrar(n);
		
		
		
	}
}
