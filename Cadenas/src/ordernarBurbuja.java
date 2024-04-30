import java.util.Scanner;


public class ordernarBurbuja {

	public static String[] a = new String[10];

	static void llenar(int n){
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Llenando arreglo a");
		
		for(i = 1; i <= n; i++){
			System.out.println("Ingrese una palabra para agregar al arreglo: ");
			a[i] = sc.nextLine();
					
		}
		
	}
	
	static void mostrar(int n){
		int i;
		System.out.println("Mostrando arreglo a");
		
		for(i = 1; i <= n; i++){
			System.out.println("Elemento " + "[" + i + "] = " + a[i] );
		}

		
		
	}
	
	static void burbuja(int t){
		int i, j;
		String x = "";
		for(i = 1; i <= t-1; i++){
			for(j = i+1; j <= t; j++){
				if(a[i].compareTo(a[j]) > 0){
					x = a[j];
					a[j] = a[i];
					a[i] = x;;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese n: ");
		
		n = sc.nextInt();
		
		llenar(n);
		mostrar(n);
		burbuja(n);
		mostrar(n);
		
		
	}

}
