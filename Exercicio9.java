import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu salario:");
        double salario = entrada.nextDouble();

        System.out.print("Digite o valor da prestação:");
        int valor = entrada.nextInt();

        if(valor > salario * 0.3){
            System.out.println("Empréstimo não concedido.");
        }else{
            System.out.println("Empréstimo concedido.");
        }
    }
}
