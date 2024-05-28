package debil;

public class Persona {
	protected
		int ci;
		String nombre;
		int fechaN;
	
	public
		Persona(){
			ci = 777777;
			nombre = "Rodrigo";
			fechaN = 2001;
		}
	
		Persona(int a, String b, int c){
			ci = a;
			nombre = b;
			fechaN = c;
		}
		
		
		int obtCi(){
			return ci;
		}
		
		String obtN(){
			return nombre;
		}
		
		int obtF(){
			return fechaN;
		}
		
		void ponCi(int a){
			ci = a;
		}
		
		void ponN(String a){
			nombre = a;
		}
		
		void ponF(int a){
			fechaN = a;
		}
		
		
		void leer(){
			System.out.println("Ingrese CI: ");
			ci = Leer.datoInt();
			System.out.println("Ingrese nombre: ");
			nombre = Leer.dato();
			System.out.println("Ingrese Anio: ");
			fechaN = Leer.datoInt();
		}
		
		void mostrar(){
			System.out.println("Nombre: " + nombre);
			System.out.println("Ci: " + ci);
			System.out.println("Nacimiento: " + fechaN);
		}
		
		void edad(){
			int actual = 2024;
			int res = actual - fechaN;		
			System.out.println("Esta persona tiene: " + res + "anios");
			
		}
}
