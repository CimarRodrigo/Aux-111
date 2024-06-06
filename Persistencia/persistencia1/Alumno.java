package persistencia1;


public class Alumno {
	private
		int cia;
		String pat = "";
		String mat = "";
		String nom = "";
		int sexo;
		int an;
		
		
	public
		Alumno(){
			cia = 4242;
			pat = "Torrez";
			mat = "Aro";
			nom = "Cecilia";
			sexo = 0;
			an = 2000;
		}
	
		Alumno(int a, String b, String c, String d, int e, int f){
			cia = a;
			pat = b;
			mat = c;
			nom = d;
			sexo = e;
			an = f;
		}

		public int obtc() {
			return cia;
		}

		public void ponc(int cia) {
			this.cia = cia;
		}

		public String obtp() {
			return pat;
		}

		public void ponp(String pat) {
			this.pat = pat;
		}

		public String obtm() {
			return mat;
		}

		public void ponm(String mat) {
			this.mat = mat;
		}

		public String obtn() {
			return nom;
		}

		public void ponn(String nom) {
			this.nom = nom;
		}

		public int obts() {
			return sexo;
		}

		public void pons(int sexo) {
			this.sexo = sexo;
		}

		public int obta() {
			return an;
		}

		public void pona(int an) {
			this.an = an;
		}
			
		void leer(){
			System.out.println("Ingrese cia");
			cia = Leer.datoInt();
			System.out.println("Ingrese paterno");
			pat = Leer.dato();
			System.out.println("Ingrese materno");
			mat = Leer.dato();
			System.out.println("Ingrese nombre");
			nom = Leer.dato();
			System.out.println("Ingrese sexo (0/1)");
			sexo = Leer.datoInt();
			System.out.println("Ingrese nacimiento");
			an = Leer.datoInt();
		}
		
		void mostrar(){
			System.out.println("Cia: " + cia);
			System.out.println("Paterno: " + pat);
			System.out.println("Materno: " + mat);
			System.out.println("Nombre: " + nom);
			System.out.println("Sexo: " + sexo);
			System.out.println("Nacimiento: " + an);
		}
		
		int edad(){
			
			int e = 2024 - an;
			return e;
		}
		
}
