import java.util.Scanner;

public class AgenteIA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Condições meteorológicas
        System.out.println("Condições meteorológicas:");
        System.out.print("Está ensolarado? (true/false): ");
        boolean ensolarado = scanner.nextBoolean();
        System.out.print("Está chovendo? (true/false): ");
        boolean chovendo = scanner.nextBoolean();

        // Decisão do agente
        boolean jogarTenis = decidirJogarTenis(ensolarado, chovendo);

        // Output
        if (jogarTenis) {
            System.out.println("O agente decide jogar tênis.");
        } else {
            System.out.println("O agente decide não jogar tênis.");
        }
    }

    public static boolean decidirJogarTenis(boolean ensolarado, boolean chovendo) {
        // Regras do agente
        if (ensolarado && !chovendo) {
            return true; // Jogar tênis se estiver ensolarado e não estiver chovendo
        } else {
            return false; // Não jogar tênis em outras condições
        }
    }
}
