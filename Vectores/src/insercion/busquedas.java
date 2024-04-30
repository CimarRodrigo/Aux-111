package insercion;

import java.util.Scanner;

public class busquedas {

	
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

	static int secuencial(int n, int x){
		
		int k = 1, p = 0;
		
		while(a[k] != x && k <=n){
			k = k + 1; 
		}
		
		if(a[k] == x){
			p = k;
		}
		
		else{
			p = -1;
		}
		
		return p;
	}
	
	
	
	
	public static void main(String[] args) {
		int n, x;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un n: ");
		n = sc.nextInt();
		
		
		llenar(n);
		
		System.out.println("Ingrese un x para buscar: ");
		x = sc.nextInt();
		
		//mostrar(n);
		
		int sw = secuencial(n, x);
		
		if(sw != -1){
			System.out.println("Numero encontrado en la posicion: " + sw);
		}
		else{
			System.out.println("Numero no encontrado");
		}
		
		
		

	}

}
