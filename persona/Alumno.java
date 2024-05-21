package persona;

public class Alumno extends Persona{
	private
		int matri;
	
	public
		Alumno(){
			super();
			matri = 177854;
		}
	
		Alumno(int a, String b, int c, int d){
			super(a, b, c);
			matri = d;
		}
		
		
		int obtCi(){
			return super.obtCi();
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
			super.ponCi(a);
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
		
		void edad(){
			super.edad();
		}
		
}
