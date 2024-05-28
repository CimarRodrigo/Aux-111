package fuerte;

public class Edificio {
	
	private 
		String nombre;
		String ubicacion;
		Departamento depto[] = new Departamento[20];
		int nd;
	public
		Edificio(){
			nombre = "Edificio Alameda";
			ubicacion = "Prado";
			
			depto[1] = new Departamento(101, 2);
			depto[2] = new Departamento(102, 3);
			nd = 2;
		}
	
		Edificio(String a, String b){
			nombre = a;
			ubicacion = b;
			
			depto[1] = new Departamento();
			nd = 1;
		}
		
		String obtN(){
			return nombre;
		}
		
		String obtU(){
			return ubicacion;
		}
		
		int obtNd(){
			return nd;
		}
		
		Departamento[] obtD(){
			return depto;
		}
		
		
		void ponN(String a){
			nombre = a;
		}
		
		void ponU(String a){
			ubicacion = a;
		}
		
		void leer(){
			int i;
			System.out.println("Ingrese el nombre del edificio: ");
			nombre = Leer.dato();
			System.out.println("Ingrese la ubicacion del edificio: ");
			ubicacion = Leer.dato();
			System.out.println("Ingrese la cantidad de departamentos que tiene el edificio: ");
			nd = Leer.datoInt();
			
			for(i = 1; i <= nd; i++){
				depto[i] = new Departamento();
				depto[i].leer();
			}
			
		}
		
		void mostrar(){
			int i;
			System.out.println("Nombre del edificio: " + nombre);
			System.out.println("Ubicacion del edificio: " + ubicacion);
			System.out.println("Departamentos: ");
			for(i = 1; i <= nd; i++){
				depto[i].mostrar();
			}
		}
		
		void compara(Edificio X){
			if(this.nd == X.obtNd()){
				System.out.println("Misma cantidad de departamentos");
			}
			else{
				System.out.println("Distinta cantidad de departamentos");
			}
		}
		
		int masHabitaciones(){
			int i, may = 0;
			
			for(i = 1; i <= nd; i++){
				if(depto[i].obtNH() > may){
					may = depto[i].obtNH();
				}
			}
			
			return may;
		}
		
		void comparaHabitaciones(Edificio X){
			if(this.masHabitaciones() > X.masHabitaciones()){
				System.out.println("El edificio " + this.nombre + " tiene un departamento con mas habitaciones que " + X.obtN());
			}else{
				System.out.println("El edificio " + X.obtN() + " tiene un departamento con mas habitaciones que " + this.nombre);
			}
			
			
		}
		
		
		public static void prueba(){
			System.out.println("Prueba");
		}
}








