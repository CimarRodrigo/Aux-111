package Labo19;

public abstract class Actor {

	protected
		String estilo;
	
	public 
		String obtE(){
			return estilo;
		}
	
		void ponE(String a){
			estilo = a;
		}
		
		abstract void leer();
	
		abstract void mostrar();
		
		
}
