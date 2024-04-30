import java.util.Scanner;


public class Ejer3 {
	
	public static int[] a = new int[10];
	
	static void llenar(int n){
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		for(i = 1; i <= n; i++){
			System.out.println("Ingrese un numero para agregar al arreglo: ");
			a[i] = sc.nextInt(); 
		}
	}
	
	static void mostrar(int n){
		int i;
		System.out.println("Mostrando arreglo");
		
		for(i = 1; i <= n; i++){
			System.out.println("Elemento " + "[" + i + "] = " + a[i] );
		}
		
	}

	static double promedio(int n){
		int i;
		
		double promedio, suma = 0;
		
		for(i = 1; i <= n; i++){
			suma = suma + a[i];
		}
		promedio = suma / n;
		return promedio;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese n: ");
		n = sc.nextInt();
		
		llenar(n);
		mostrar(n);
		
		System.out.println(promedio(n));
		
		
	}

}
