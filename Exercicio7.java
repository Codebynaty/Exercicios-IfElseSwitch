import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = entrada.nextDouble();

        System.out.print("Digite o tempo de trabalho (em anos): ");
        int anos = entrada.nextInt();

        double bonus;

        if (anos >= 5) {
            bonus = salario * 0.20;
        } else {
            bonus = salario * 0.10;
        }

        System.out.printf("O bônus do funcionário é: R$ %.2f%n", bonus);

        entrada.close();
    }
}
