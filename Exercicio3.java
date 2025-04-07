import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        if (num1 == num2) {
            System.out.println("Números iguais");
        } else {
            int maior = Math.max(num1, num2);
            int menor = Math.min(num1, num2);
            int diferenca = maior - menor;
            System.out.println("Diferença: " + diferenca);
        }

        entrada.close();
    }
}
