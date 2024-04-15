package Cadenas_Arreglos_Java;

public class cadenas {
	
	
	public static void main(String[] args) {
		int i;
		String cadena = "Hola buenas", aux1;
		char aux;
		int tam = cadena.length();
		
		
		// System.out.println(cadena.substring(0, 7));
		
		for(i = 0; i < tam; i++) {
			// python: cad[i]
			aux = cadena.charAt(i); // otra forma de recorrer la cadena
			
			if(aux == 'a') { // en char se puede comparar con ==
				System.out.println(aux + " ES UNA A");
			}else {
				System.out.println(aux);
			}		
		}	
		// a[i]
        
		
		cadena  = "12345789";
		for(i = 1; i <= cadena.length(); i++) {
			// python: cad[i]
			aux1 = cadena.substring(i-1, i); // otra forma de recorrer la cadena
			int suma = Integer.parseInt(aux1); // funcion para convertir un numero tipo cadena a int
			System.out.println(suma);
			
		}	
		
		
		
	}
}	
