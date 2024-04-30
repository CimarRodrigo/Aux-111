import java.util.Scanner;


public class matrizEliminar {

	
	public static String[][] a = new String[10][10];
	
	
	static void llenarm(int n) 
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		for (i = 1; i <= n; i++) 
		{
			for(j=1;j<=n;j++)
			{ System.out.println("a["+i+"]["+j+"]=");
		  	  a[i][j] = sc.next();
			}
		}
	}

	static void mostrarm(int n) {
		int i,j;
		for (i = 1; i <= n; i++) 
		{  for (j=1;j<=n;j++)
		   {
			System.out.print("\t" + a[i][j]);
		   }
		   System.out.println("\n");
		}
	}
	
	static String eliminar(String x){
		String ret = "";
		
		ret = x.substring(1, x.length());
		ret = ret.substring(0, ret.length() -1);
		return ret;
	}
	
	
	static void recEliminar(int n){
		int i, j, sw = 0;
		
		for(i = 1; i <= n; i++){
			for(j = 1; j <= n; j++){
				if(sw == 1){
					a[i][j] = eliminar(a[i][j]);
					sw = 0;
				}
				else{
					sw = 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		llenarm(n);
		mostrarm(n);
		recEliminar(n);
		mostrarm(n);
	}

}
