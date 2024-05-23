package labo19_2;

public class Docente extends Persona_CA{
	private
		int item;
		String especialidad;
	public
		Docente(){
			super();
			item = 123;
			especialidad = "INF";
		}
	
		Docente(int a, String b, int c, int d, String e){
			super.ponC(a);
			super.ponN(b);
			super.ponF(c);
			item = d;
			especialidad = e;
		}
		
		int obtCi(){
			return super.obtC();
		}
		
		String obtNo(){
			return super.obtN();
		}
		
		int obtFe(){
			return super.obtF();
		}
		
		int obtIt(){
			return item;
		}
		
		
		void ponCi(int a){
			super.ponC(a);
			
		}
		
		void ponNo(String a){
			super.ponN(a);
		}
		
		void ponFe(int a){
			super.ponF(a);;
		}
		
		void ponIt(int a){
			item = a;
		}
		
		
		
		void leer(){
			super.leer();
			System.out.println("Ingrese item: ");
			item = Leer.datoInt();
		}
		
		void mostrar(){
			super.mostrar();
			System.out.println("Item: " + item);
			System.out.println("Especialidad: " + especialidad);
			
		}

		void edad() {
			System.out.println("Edad: " + (2024 - super.obtF()));
		}
		
	
	
}
