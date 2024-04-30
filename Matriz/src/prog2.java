import java.util.Scanner;


public class prog2 {

	public static int[][] a = new int[10][10];
    public static int[] b = new int[10];
	static void llenarm(int n, int m) 
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		for (i = 1; i <= n; i++) 
		{
			for(j=1;j<=m;j++)
			{ System.out.println("a["+i+"]["+j+"]=");
		  	  a[i][j] = sc.nextInt();
			}
		}
	}

	static void mostrarm(int n, int m) {
		int i,j;
		for (i = 1; i <= n; i++) 
		{  for (j=1;j<=m;j++)
		   {
			System.out.print("\t" + a[i][j]);
		   }
		   System.out.println("\n");
		}
	}
	
	static void mayorFila(int n, int m){
		int i, j;
		int may = 0;
		for(i = 1; i <= n; i++){
			
			for(j = 1; j <= n; j++){
				if(a[i][j] > may){
					may = a[i][j];
				}
			}
			b[i] = may;
			may = 0;
		}
	}
	
	static void mostrarB(int n){
		int i;
		System.out.println("Mostrando vector b");
		for(i = 1; i <= n; i++){
			System.out.print("\t" + b[i]);
		}
	}
	
	public static void main(String[] args) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro n, m ");
		n = sc.nextInt();
		m = sc.nextInt();
		llenarm(n,m);
		mostrarm(n,m);
		
		mayorFila(n, m);
		mostrarB(n);
		
	}

}
