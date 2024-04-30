import java.util.Scanner;


public class Ejer2 {

	
	static int esVocal(String w){
		int k = 0;
		if(w.compareTo("a") == 0 || w.compareTo("e") == 0 || w.compareTo("i") == 0 || 
				w.compareTo("o") == 0 || w.compareTo("u") == 0 ){
			k = 1;
		}
		
		return k;
	}
	
	
	static String sacarPal(String b, int k){
		int c = 0, ele, i;
		String y, v = "", w = "";
		b = b + " ";
		ele = b.length();
		
		for(i = 1; i <= ele; i++){
			y = b.substring(i-1, i);
			if(y.compareTo(" ") == 0){
				c = c + 1;
				if(c == k){
					w = v;
				}
				v = "";
			}
			else{
				v = v + y;
			}
		}
		
		return w;
	}
	
	
	static int contarPal(String b){
		int c = 0, ele, i;
		String y;
		b  = b + " ";
		ele = b.length();
		
		for(i = 1; i <= ele; i++){
			y = b.substring(i-1, i);
			if(y.compareTo(" ") == 0){
				c = c + 1;
			}
		}
		
		return c;
	}
	
	
	static String eliVocal(String b, int k){
		int c = 0, ele, i;
		String y, v = "";
		b = b + " ";
		ele = b.length();
		
		for(i = 1; i <= ele; i++){
			y = b.substring(i-1, i);
			if(esVocal(y) == 1){
				c = c + 1;
				if(c == k){
					y = "";
				}
				
			}
			v = v + y;
		}
		
		return v;
	}
	
	static String voltearCadenas(String b){
		String invertido = "", y;
		int ele = b.length(), i;
		
		for(i = 1; i <= ele; i++){
			y = b.substring(i-1, i);
			invertido = y + invertido;
		}
		
		
		return invertido;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, ele;
		String palabra, z = "", pal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra: ");
		palabra = sc.nextLine();
		ele = contarPal(palabra);
		
		
		for(i = 1; i <= ele; i++){
			pal = sacarPal(palabra, i);
			if(i % 2 == 0){
				pal = voltearCadenas(pal);
			}
			z = z + pal + " ";
		}
		
	
		
		System.out.println(z);
		
		
	}

}
