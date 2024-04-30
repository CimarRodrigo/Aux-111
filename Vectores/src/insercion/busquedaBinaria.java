package insercion;

import java.util.Scanner;

public class busquedaBinaria {

	
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
	
	static int busquedaBinaria(int n, int x){
		int li = 1, ls = n, lc = (li + ls)/2;
		int p = -1;
		
		while(a[lc] != x && li <= ls){
			if(x > a[lc]){
				li = lc + 1;
			}
			else{
				ls = lc - 1; 
			}
			
			lc = (li + ls)/2;
		}
		
		if(a[lc] == x){
			p = lc;
		}
		else{
			p = -1;
		}
		
		return p;
	}
	
	static void burbuja(int t){
		int i, j;
		int x;
		for(i = 1; i <= t-1; i++){
			for(j = i+1; j <= t; j++){
				if(a[i] > a[j]){
					x = a[j];
					a[j] = a[i];
					a[i] = x;;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n, x;
		
		System.out.println("Ingrese un n:");
		n = sc.nextInt();
		llenar(n);
		burbuja(n);
		mostrar(n);
		System.out.println("Ingrese un x para buscar: ");
		x = sc.nextInt();
		
		
		int sw = busquedaBinaria(n, x);
		
		if(sw != -1){
			System.out.println("Numero encontrado en la posicion: " + sw);
		}
		else{
			System.out.println("Numero no encontrado");
		}
		
		
		
	}

}
