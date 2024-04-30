
import java.util.Scanner;


public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,ele,a,a1;
		String b,y,v="";
		char x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro cad:");
		b = sc.nextLine();
		ele = b.length();
		for (i = 1; i <= ele; i++) {
			y = b.substring(i-1, i);
			if (y.compareTo(" ")!=0) {
				a = (int)y.hashCode();
				
				a1 = a+32;
				x = (char) a1;
				y= "" + x;
			}
			v= v+y;
			
		}
		System.out.println("= "+v);
	}

}
