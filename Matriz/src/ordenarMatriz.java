import java.util.Scanner;


public class ordenarMatriz {
	static int matriz[][] = new int[10][10];
	static int a[] = new int[100];
	static int pos = 0;
	
	static void llenar(int n){
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				matriz[i][j] = sc.nextInt();
			}
		}
	}
	
	
	static void mostrar(int n){
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				System.out.println(matriz[i][j]);
			}
		}
	}
	
	static void mToa(int n){
		pos = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				a[pos] = matriz[i][j];
				pos++;
			}
		}
		
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
		
		int n = sc.nextInt();
		
		llenar(n);
		
		
		mToa(n);
		pos = n*n;
		burbuja(pos);
		for(int i = 1; i <= pos; i++){
			System.out.println(a[i]);
		}
		
		
		
	}

}
