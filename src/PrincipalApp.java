
public class PrincipalApp {
	public static void main(String[] args) {
        String frase = "Hola, ¿cómo estás?";
        NumeroConsonantes contador = new NumeroConsonantes(frase);
        int numConsonantes = contador.contarConsonantes();
        System.out.println("El número de consonantes en la frase es: " + numConsonantes);
    }
}
