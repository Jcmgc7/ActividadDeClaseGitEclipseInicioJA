public class NumeroConsonantes {
    private String frase;

    public NumeroConsonantes(String frase) {
        this.frase = frase;
    }

    public int contarConsonantes() {
        int contador = 0;
        String fraseMinusculas = frase.toLowerCase();

        for (int i = 0; i < fraseMinusculas.length(); i++) {
            char caracter = fraseMinusculas.charAt(i);

            if (Character.isLetter(caracter) && !esVocal(caracter)) {
                contador++;
            }
        }

        return contador;
    }

    private boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }

}