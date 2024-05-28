package fuerte;

public class MainEdificio {

	public static void main(String[] args) {
		Edificio e1 = new Edificio();
		Edificio e2 = new Edificio();
		
		e1.mostrar();
		
		e2.leer();
		e2.mostrar();
		
		
		e1.compara(e2);
		e1.comparaHabitaciones(e2);
		

	}

}
