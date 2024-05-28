package fuerte;

public class Departamento {
	private 
		int num;
		int numeroHabitaciones;
	public
		Departamento(){
			num = 1;
			numeroHabitaciones = 3;
		}
	
		Departamento(int a, int b){
			num = a;
			numeroHabitaciones = b;
		}
		
		int obtN(){
			return num;
		}
		
		int obtNH(){
			return numeroHabitaciones;
		}
		
		void ponN(int a){
			num = a;
		}
		
		void ponNH(int a){
			numeroHabitaciones = a;
		}
		
		
		void leer(){
			System.out.println("Ingrese numero de departamento: " );
			num = Leer.datoInt();
			System.out.println("Ingrese numero de habitaciones: ");
			numeroHabitaciones = Leer.datoInt();
		}
		
		void mostrar(){
			System.out.println("Numero de departamento: " + num);
			System.out.println("Numero de habitaciones: " + numeroHabitaciones);
		}
		
		
		
}
