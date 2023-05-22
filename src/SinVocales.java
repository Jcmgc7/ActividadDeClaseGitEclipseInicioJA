public class SinVocales {
    private String frase;

    public SinVocales(String frase) {
        this.frase = frase;
    }

    public String quitarVocales() {
        StringBuilder sinvocales = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (!esVocal(c)) {
                sinvocales.append(c);
            }
        }

        return sinvocales.toString();
    }

    private boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}