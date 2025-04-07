import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário: R$ ");
        double salario = entrada.nextDouble();
        double desconto;

        if (salario <= 600.00) {
            System.out.println("Isento de desconto do INSS.");
        } else if (salario <= 1200.00) {
            desconto = salario * 0.20;
            System.out.println("Desconto do INSS: R$ " + desconto);
        } else if (salario <= 2000.00) {
            desconto = salario * 0.25;
            System.out.println("Desconto do INSS: R$ " + desconto);
        } else {
            desconto = salario * 0.30;
            System.out.println("Desconto do INSS: R$ " + desconto);
        }

        entrada.close();
    }
}