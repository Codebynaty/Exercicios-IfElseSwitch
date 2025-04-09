import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade desejada: ");
        int quantidade = scanner.nextInt();

        String produto = "";
        double preco = 0.0;

        
        switch (codigo) {
            case 100:
                produto = "Chachorro Q!Jente";
                preco = 1.20;
                break;
            case 101:
                produto = "Bauru Simple";
                preco = 1.30;
                break;
            case 102:
                produto = "Bauru com ovo";
                preco = 1.50;
                break;
            case 103:
                produto = "Hambúrguer";
                preco = 1.20;
                break;
            case 104:
                produto = "Cheeseburguer";
                preco = 1.30;
                break;
            case 105:
                produto = "Refrigerante";
                preco = 1.00;
                break;
            default:
                System.out.println("Código inválido.");
                scanner.close();
                return; 
        }

       
        double total = preco * quantidade;

        
        System.out.printf("Produto: %s%n", produto);
        System.out.printf("Total a pagar: R$ %.2f%n", total);

        scanner.close();
    }
}
