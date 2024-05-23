package labo19_2;

public class Vehiculo implements Transporte_I, Actor_I {
	private
		String placa;
		String marca;
		int modelo;
	
	public
		Vehiculo(){
			placa = "ABC-123";
			marca = "Toyota";
			modelo = 2000;
		}
		
		Vehiculo(String a, String b, int c){
			placa = a;
			marca = b;
			modelo = c;
		}
		
		String obtP(){
			return placa;
		}
		
		String obtM(){
			return marca;
		}
		
		int obtMo(){
			return modelo;
		}
		
		void ponP(String a){
			placa = a;
		}
		
		void ponM(String a){
			marca = a;
		}
		
		void ponMo(int a){
			modelo = a;
		}
		
		
		public void leer(){
			System.out.println("Ingrese placa: ");
			placa = Leer.dato();
			System.out.println("Ingrese marca: ");
			marca = Leer.dato();
			System.out.println("Ingrese modelo: ");
			modelo = Leer.datoInt();
		}
		
		public void mostrar(){
			System.out.println("Placa: " + placa);
			System.out.println("Marca: " + marca);
			System.out.println("Modelo: " + modelo);
		}
}
