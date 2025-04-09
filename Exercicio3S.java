import java.util.Scanner;

public class SaudacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o período em que você estuda (M - Matutino, V - Vespertino, N - Noturno): ");
        char periodo = scanner.next().toUpperCase().charAt(0); 
        switch (periodo) {
            case 'M':
                System.out.println("Bom dia");
                break;
            case 'V':
                System.out.println("Boa tarde");
                break;
            case 'N':
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Período inválido. Digite M, V ou N.");
        }

        scanner.close();
    }
}
