package debil;

public class Materia {
	private
		String sigla;
		int semes;
	public
		Materia(){
			sigla = "INF-111";
			semes = 1;
		}
	
		Materia(String a, int b){
			sigla = a;
			semes = b;
		}
		
		String obtSi(){
			return sigla;
		}
		
		int obtSe(){
			return semes;
		}
		
		void ponSi(String a){
			sigla = a;
		}
		
		void ponSe(int a){
			semes = a;
		}
		
		void leer(){
			System.out.println("Ingrese sigla");
			sigla = Leer.dato();
			System.out.println("Ingrese semestre");
			semes = Leer.datoInt();
		}
		
		void mostrar(){
			System.out.println("Sigla: " + sigla);
			System.out.println("Semestre: " + semes);
		}
	
}
