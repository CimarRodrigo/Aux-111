package persona;

public class Docente extends Persona{
	private
		int item;
	
	public
		Docente(){
			super();
			item = 123;
		}
	
		Docente(int a, String b, int c, int e){
			super(a, b, c);
			item = e;
		}
		
		int obtCi(){
			return super.obtCi();
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
			super.ponCi(a);
			
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
			
		}
		
		void edad(){
			super.edad();
		}
		
	
}
