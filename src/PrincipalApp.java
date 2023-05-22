import java.util.*;
public class PrincipalApp {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		int opcion;
		boolean salir=false;
		do {
			System.out.println("Qué quieres hacer: ");
			System.out.println("1. Numero consonantes: ");
			System.out.println("2. Frase sin vocales : ");
			System.out.println("3. Salir");

			opcion=sc.nextInt();
	        String frase = "Hola, ¿como estas?";

			switch(opcion) {
			
			case 1:
				System.out.println("La frase es: " + frase);
				NumeroConsonantes contador = new NumeroConsonantes(frase);
		        int numConsonantes = contador.contarConsonantes();
		        System.out.println("El número de consonantes en la frase es: " + numConsonantes);
				break;
			case 2:
				System.out.println("La frase es: " + frase);
				SinVocales pasarfrase = new SinVocales(frase);
				String frasehecha = pasarfrase.quitarVocales();
		        System.out.println("La frase sin vocales es: " + frasehecha);

				break;
			case 3: 
				salir = true;
				break;
			}
			
		} while (!salir);
		
        
        
        
        
        
        
    }
}
