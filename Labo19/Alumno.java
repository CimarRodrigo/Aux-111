package Labo19;

public class Alumno extends Persona{
	private
		int matri;
	
	public
		Alumno(){
			super();
			matri = 177854;
		}
	
		Alumno(String a, int b, String c, int d, int e){
			super(a, b, c, d);
			matri = d;
		}
		
		
		int obtCi(){
			return super.obtC();
		}
		
		String obtN(){
			return super.obtN();
		}
		
		int obtF(){
			return super.obtF();
		}
		
		int obtM(){
			return matri;
		}
		
		
		void ponCi(int a){
			super.ponC(a);
		}
		
		void ponN(String a){
			super.ponN(a);
		}
		
		void ponF(int a){
			super.ponF(a);
		}
		
		void ponM(int a){
			matri = a;
		}
		
		
		
		void leer(){
			super.leer();
			System.out.println("Matricula: ");
			matri = Leer.datoInt();
		}
		
		void mostrarAlumno(){
			super.mostrar();
			System.out.println("Matricula: " +  matri);
		}
		

		
}
