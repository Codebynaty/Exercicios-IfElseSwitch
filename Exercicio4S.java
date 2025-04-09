import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu plano (A, B ou C): ");
        char plano = scanner.next().toUpperCase().charAt(0); 

        System.out.print("Digite o seu salário: ");
        double salario = scanner.nextDouble();

        switch (plano) {
            case 'A':
                System.out.println("Seu salário é: " + (salario + salario * 0.10));
                break;
            case 'B':
                System.out.println("Seu salário é: " + (salario + salario * 0.15));
                break;
            case 'C':
                System.out.println("Seu salário é: " + (salario + salario * 0.20));
                break;
            default:
                System.out.println("Plano inválido. Digite A, B ou C.");
        }

        scanner.close();
    }
}
