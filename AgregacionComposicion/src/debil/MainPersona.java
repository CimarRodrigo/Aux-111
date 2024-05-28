package debil;

public class MainPersona {

	public static void main(String[] args) {
		Alumno a1 = new Alumno();
		Alumno a2 = new Alumno(666, "Marcelo", 2001, 78777);
		Materia m1 = new Materia();
		Materia m2 = new Materia("114", 1);
		Materia m3 = new Materia("115", 1);
		Materia m4 = new Materia("121", 2);
		Materia m5 = new Materia("131", 2);
		Materia m6 = new Materia("124", 2);
		
		
		Materia[] mm = new Materia[10];
		
		mm[1] = m1;
		mm[2] = m2;
		mm[3] = m3;
		
		P_inscripcion pi1 = new P_inscripcion(2, 2024, a1, mm, 3);
		
		pi1.mostrar();
		
		
	}

}
