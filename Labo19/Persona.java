package Labo19;

public class Persona extends Actor{
	private
		int ci;
		String nombre;
		int fechaN;
	public
		Persona(){
			super.ponE("aaaa");
			ci = 1111;
			nombre = "Marcelo";
			fechaN = 2001;
		}
	
		Persona(String a, int b, String c, int d){
			super.ponE(a);
			ci = b;
			nombre = c;
			fechaN = d;
		}
		
		int obtC(){
			return ci;
		}
		
		String obtN(){
			return nombre;
		}
		
		int obtF(){
			return fechaN;
		}
		
		void ponC(int a){
			ci = a;
		}
		
		void ponN(String a){
			nombre = a;
		}
		
		void ponF(int a){
			fechaN = a;
		}
		
		
		void leer(){
			System.out.println("Ingrese estilo: ");
			super.ponE(Leer.dato());
			System.out.println("Ingrese ci: ");
			ci = Leer.datoInt();
			System.out.println("Ingrese nombre: ");
			nombre = Leer.dato();
		}
		
		void mostrar(){
			System.out.println("Estilo: " + super.obtE());
			System.out.println("CI: " + ci);
			System.out.println("Nombre: " + nombre);
		}	
	
}
