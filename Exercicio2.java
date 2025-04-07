import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual a sua idade? ");
        int numero = entrada.nextInt();

        if (numero < 18) {
            System.out.println("Você é menor de idade.");
        } else { 
            System.out.println("Você é maior de idade."); 
        }

        entrada.close();
    }
}
