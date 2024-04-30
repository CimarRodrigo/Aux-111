package insercion;

import java.util.Scanner;

public class ejer1 {

	
	public static int[] a = new int[10];
	
	static void llenar(int n){
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Llenando arreglo a");
		
		for(i = 1; i <= n; i++){
			System.out.println("Ingrese un numero para agregar al arreglo: ");
			a[i] = sc.nextInt();
					
		}
		
	}
	
	static void mostrar(int n){
		int i;
		System.out.println("Mostrando arreglo a");
		
		for(i = 1; i <= n; i++){
			System.out.println("Elemento " + "[" + i + "] = " + a[i] );
		}

		
		
	}
	
	
	static void insercion(int n){
		int i, k, x;
		
		for(i = 2; i <= n; i++){
			k = i;
			
			while(a[k] < a[k-1] && k >= 2){
				x = a[k];
				a[k] = a[k-1];
				a[k-1] = x;
				
				k = k - 1; 
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
