import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a altura (em metros): ");
        double altura = entrada.nextDouble();

        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = entrada.next().toUpperCase().charAt(0);

        double pesoIdeal;

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido.");
            entrada.close();
            return;
        }

        System.out.printf("O peso ideal é: %.2f kg%n", pesoIdeal);

        entrada.close();
    }
}
