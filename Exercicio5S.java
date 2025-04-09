import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        
        System.out.print("Escolha a operação (M - Média, S - Diferença, P - Produto, D - Divisão): ");
        char opcao = scanner.next().toUpperCase().charAt(0);

        
        switch (opcao) {
            case 'M':
                double media = (num1 + num2) / 2;
                System.out.println("A média dos números é: " + media);
                break;
            case 'S':
                double diferenca = Math.abs(num1 - num2);
                System.out.println("A diferença entre o maior e o menor é: " + diferenca);
                break;
            case 'P':
                double produto = num1 * num2;
                System.out.println("O produto dos números é: " + produto);
                break;
            case 'D':
                if (num2 != 0) {
                    double divisao = num1 / num2;
                    System.out.println("A divisão do primeiro pelo segundo é: " + divisao);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida. Use M, S, P ou D.");
        }

        scanner.close();
    }
}
