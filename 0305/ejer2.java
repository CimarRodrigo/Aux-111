package ejercicio1;

import java.util.Arrays;

public class ejer2 {

	public static int[][] a = new int[10][10];
	
	public static void mostrar(int n) {
		int i, j;
		for(i = 1; i <= n; i++) {
			for(j = 1; j <= n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		int n = 7;
		
		int c = n*n;
		
		int izq, aba, der, arr;
		int topeI = 1, topeD = n, topeAr = 2, topeAb = n;
		int posF = 1, posC = n;
		int aux = 0;
		int sw = 0; // 0 => izq, 1 = abajo, 2 = der, 3 = arr
		for(int i = 1; i <= n*n; i++) {
			
			if(sw == 0) {
				a[posF][posC] = c;
				c--;
				if(posC == topeI) {
					
					sw = 1;
					topeI++;
					posF++;
				}
				
				else {
					posC--;
				}
				
			}
			
			else if(sw == 1) {
				a[posF][posC] = c;
				c--;
				
				if(posF == topeAb) {
					sw = 2;
					topeAb--;
					posC++;
				}else{
					posF++;
				
				}
				
			}
			else if (sw == 2){
				a[posF][posC] = c;
				c--;
				
				if(posC == topeD) {
					sw = 3;
					topeD--;
					posF--;
				}else {
					posC++;
				}
				
			}
			else if(sw == 3) {
				a[posF][posC] = c;
				c--;
				
				if(posF == topeAr) {
					sw = 0;
					topeAr++;
					posC--;
				}
				else {
					posF--;
				}
			}
			mostrar(n);
			
		}
	
		
	}
	


}
