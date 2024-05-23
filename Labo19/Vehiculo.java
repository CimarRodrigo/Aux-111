package Labo19;

public class Vehiculo extends Actor implements Objeto {
	private
		String color;
	
	public
		Vehiculo(){
			super.ponE("bbbb");
			color = "verde";
		}
		
		Vehiculo(String a, String b){
			super.ponE(a);
			color = b;
		}
		
		String obtC(){
			return color;
		}
		
		void ponC(String a){
			color = a;
		}
		
		public void leer(){
			System.out.println("Ingrese estilo: ");
			super.ponE(Leer.dato());
			System.out.println("Ingrese color: ");
			color = Leer.dato();
		}
		
		public void mostrar(){
			System.out.println("Estilo: " + super.estilo);
			System.out.println("Color: " + color);
		}
}
