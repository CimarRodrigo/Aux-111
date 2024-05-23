package labo19_2;

public abstract class Persona_CA implements Actor_I{
	private
		int ci;
		String nombre;
		int fechaN;
	public
		
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
		
		
		abstract void edad();
		
		void leer(){
			System.out.println("Ingrese ci: ");
			ci = Leer.datoInt();
			System.out.println("Ingrese nombre: ");
			nombre = Leer.dato();
		}
		
		void mostrar(){
			System.out.println("CI: " + ci);
			System.out.println("Nombre: " + nombre);
		}	
	
		
}
