package debil;

public class P_inscripcion {
	private
		int num;
		int gestion;
		Alumno A;
		Materia mat[] = new Materia[10];
		int nm;
	
	public
		P_inscripcion(){
			num = 1;
			gestion = 2024;
			A = new Alumno(111111, "Juan", 2001, 17781);
			mat[1] = new Materia("111", 1);
			mat[2] = new Materia("114", 1);
			mat[3] = new Materia("115", 1);
			nm = 3;
		}
		
		P_inscripcion(int a, int b, Alumno c, Materia[] d, int e){
			num = a;
			gestion = b;
			A = c;
			mat = d;
			nm = e;
		}
		
		int obtNum(){
			return num;
		}
		
		int obtG(){
			return gestion;
		}
		
		Alumno obtA(){
			return A;
		}
		
		Materia[] obtM(){
			return mat;
		}
		
		int obnNm(){
			return nm;
		}
		
		
		void ponNum(int a){
			num = a;
		}
		
		void ponG(int a){
			gestion = a;
		}
		
		void ponA(Alumno a){
			A = a;
		}
		
		void ponM(Materia[] a){
			mat = a;
		}
		
		void ponNm(int a){
			nm = a;
		}
		
		
		
		void leer(){
			System.out.println("Ingrese num: ");
			num = Leer.datoInt();
			System.out.println("Ingrese gestion: ");
			gestion = Leer.datoInt();
			System.out.println("Ingrese datos de alumno: ");
			A.leer();
			System.out.println("Ingrese cantidad de materias: ");
			nm = Leer.datoInt();
			
			for(int i = 1; i <= nm; i++){
				System.out.println("-------Ingrese materia: --------");
				mat[i].leer(); 
			}
			
		}
		
		
		void mostrar(){
			System.out.println("Num: " + num);
			System.out.println("Gestion: " + gestion);
			System.out.println("Alumno: ");
			A.mostrar();
			System.out.println("Materias: ");
			for(int i = 1; i <= nm; i++){
				mat[i].mostrar();
			}
		}
		
		
}
