import java.util.Scanner;


public class prog4 {
	public static int[][] a = new int[10][10];
    public static int[][] b = new int[10][10];
    public static int[][] c = new int[10][10];
	static void llenarm(int n, int m, int[][] mat) 
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		for (i = 1; i <= n; i++) 
		{
			for(j=1;j<=m;j++)
			{ 
				System.out.println("["+i+"]["+j+"]=");
		  	  	mat[i][j] = sc.nextInt();
			}
		}
	}

	static void mostrarm(int n, int m, int[][] mat) {
		int i,j;
		for (i = 1; i <= n; i++) 
		{  for (j=1;j<=m;j++)
		   {
			System.out.print("\t" + mat[i][j]);
		   }
		   System.out.println("\n");
		}
	}
	
	static void multiplicar(int n, int m, int x){
		int i, j, k, s = 0;
		for(i = 1; i <= n; i++){
			for(j = 1; j <= m; j++){
				for(k = 1; k <= x; k++){
					s = s + a[i][k] * b[k][j];
				}
				c[i][j] = s;
				s = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		int n, m, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro datos A (n, x)");
		n = sc.nextInt();
		x = sc.nextInt();
		System.out.println("Intro datos B (solo columna m)");
		m = sc.nextInt();
		llenarm(n, x, a);
		llenarm(x, m, b);
		
		System.out.println("Mostrando a");
		mostrarm(n, x, a);
		System.out.println("Mostrando b");
		mostrarm(x, m, b);
		
		multiplicar(n, m, x);
		
		System.out.println("Mostrando resultado");
		mostrarm(n,  m, c);
		
	}
}
