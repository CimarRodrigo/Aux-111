import java.util.Scanner;



public class formasMatriz {

	public static int[][] a = new int[10][10];
	
	
	static void caracol(int n){
		int i, j, k, li = 1, ls = n, c = 1;
		
		for(k = 1; k <= n/2; k++){
			i = li;
			
			for(j = li; j <= ls; j++){
				a[i][j] = c;
				c = c + 1;
			}
			j = ls;
			
			for(i = li+1; i <= ls; i++){
				a[i][j] = c;
				c = c + 1;
			}	
			i = ls;
			
			for(j = ls - 1; j >= li; j--){
				a[i][j] = c;
				c = c + 1;
			}
			j = li;
			
			for(i = ls - 1; i >= li+1; i--){
				a[i][j] = c;
				c = c + 1;
			}
			
			ls = ls-1;
			li = li +1;
			if(n%2 == 1){
				a[(n/2)+1][(n/2)+1] = c;
			}
		}
	}
	
	static void rombo(int n){
		int i, j, li, ls, c = 1;
		li = (n/2)+1;
		ls = li;
		
		for(i = 1; i <= n; i++){
			for(j = li; j <= ls; j++){
				a[i][j] = c;
				c = c + 1;
			}
			if(i >= (n/2)+1 ){
				li = li + 1;
				ls = ls - 1;
			}
			else{
				li = li - 1;
				ls = ls + 1;
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
	
	
	static void zigZag(int n){
		int i, j, k, c = 1;
		for(k = 1; k <= n; k++){
			if(k % 2 == 1){
				i = k;
				for(j = 1; j <= k; j++){
					a[i][j] = c;
					c = c + 1;
					i = i - 1;
				}
			}
			else{
				j = k;
				for(i = 1; i <= k; i++){
					a[i][j] = c;
					c = c + 1;
					j = j - 1;
				}
			}
		}
		
		for(k = 2; k <= n; k++){
			if(k % 2 == 0){
				j = n;
				for(i = k; i <= n; i++){
					a[i][j] = c;
					c = c + 1;
					j = j - 1;
				}
			}
			else{
				i = n;
				for(j = k; j <= n; j++){
					a[i][j] = c;
					c = c + 1;
					i = i - 1;
				}
			}
		}
		
	}
	
	
	static void eles(int n){
		int i, j, k, x, c = 1;
		a[1][n] = c;
		c = c + 1;
		for(k = 2; k <= n; k++){
			
			j  = n-k+1;
			for(i = 1; i <= k; i++){
				a[i][j] = c;
				c = c + 1;
			}
			
			i = k;
			x = j + 1;
			
			for(j = x; j <= n; j++){
				a[i][j] = c;
				c = c + 1;
			}
			
			
		}
	}
	
	
	static void cerear(int n){
		int i, j;
		
		for(i = 1; i <= n; i++){
			for(j = 1; j <= n; j++){
				a[i][j] = 0;
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese n: ");
		int n = sc.nextInt(), op;
		//mostrarm(n, n, a);
		//caracol(n);
		op = 1;
		while( op != 5){
			System.out.println("1. Caracol");
			System.out.println("2. Rombo");
			System.out.println("3. Eles");
			System.out.println("4. Zig Zag");
			System.out.println("5. Fin");
			System.out.print("Intro opcion: ");
			op = sc.nextInt();
			
			switch(op){
				case 1:
					cerear(n);
					caracol(n);
					mostrarm(n, n, a);
					break;
				case 2:
					cerear(n);
					rombo(n);
					mostrarm(n, n, a);
					break;
				case 3:
					cerear(n);
					eles(n);
					mostrarm(n, n, a);
					break;
				case 4:
					cerear(n);
					zigZag(n);
					mostrarm(n, n, a);
					break;
					
			}
			
		}
		System.out.println("FIN");
		
	}

}
