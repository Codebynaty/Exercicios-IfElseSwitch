import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();
        
        if (a > b) {
            System.out.println(a + " " + b);
        } else {
            System.out.println(b + " " + a);
        }
        
        scanner.close();
    }
}