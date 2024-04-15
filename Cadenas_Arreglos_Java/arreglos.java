package Cadenas_Arreglos_Java;

import java.util.Arrays;
import java.util.Scanner;

public class arreglos {
	
	static int[] arreglo = new int[10000000 + 100]; // arreglo vacio
	static int[] arregloLleno = {0, 5, 4, 3, 2, 1, 5 }; // arreglo con datos
	
	static void mostrarClasico(int n, int[] x) {
		//FOR CLASICO
		
		for(int i = 1; i <= n; i++) {
			System.out.print(x[i] + " ");
		}
		
		System.out.println();
	}
	
	static void mostrarForEach(int[] x) {
		//FOR EACH - no se puede acceder a otras posiciones
		System.out.println("MOSTRANDO CON FOR EACH");
		for(int j: x) { 
			System.out.println(j);
		}
	}
	
	static void llenar(int n) {
		//Scanner sc = new Scanner(System.in); // ctrl + shift + o = importacion rapida
		int rn; 
		
		for(int i = 1; i <= n; i++) {
			//System.out.println("Ingrese un numero para agregar: ");
			arreglo[i] = (int) (Math.random()*10 +1);//sc.nextInt(); // llenar con numeros aleatorios
		}
	}
	
	
	static int[] suma(int arr[]) {
		int[] a = {1, 2, 3};
		
		return a;
	}
	
	static void burbuja(int n, int[] arr) {
		int i, j;
		int aux = arr[1];
		for(i = 1; i <= n-1; i++) {
			for(j = i+1; j <= n; j++) {
				if(arr[i] < arr[j]) {
					aux = arr[j];
					arr[j] = arr[i];
					arr[i] = aux;		
				}
				mostrarClasico(n, arr);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		
		//llenar(n);
		//mostrarClasico(n);
		//burbuja(n);
		//Arrays.sort(arreglo); // sort por defecto en java
		//mostrarClasico(n);
		mostrarClasico(6, arregloLleno);
		int[] arregloCopia = arregloLleno.clone();
		arregloCopia[1] = 2;
		
		mostrarClasico(5, arregloCopia);
		mostrarClasico(6, arregloLleno);
		
		//System.out.println("ORDENADO");
		
		
		
	}

}
