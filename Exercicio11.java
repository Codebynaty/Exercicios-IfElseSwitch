import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Você está na turma infantil A.");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Você está na turma infantil B.");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Você está na turma infanto-juvenil A.");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Você está na turma juvenil B.");
        } else if (idade >= 18) {
            System.out.println("Você está na turma adulto.");
        } else {
            System.out.println("Idade inválida para as turmas disponíveis.");
        }

        entrada.close();
    }
}


