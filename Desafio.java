import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();

        System.out.print("Você é alfabetizado? (s/n): ");
        char alfabetizado = entrada.next().toLowerCase().charAt(0);

        System.out.print("Você possui título de eleitor? (s/n): ");
        char temTitulo = entrada.next().toLowerCase().charAt(0);

        if (temTitulo == 's') {
            if (alfabetizado == 's') {
                if (idade >= 18 && idade <= 70) {
                    System.out.println("Apto a votar,Voto obrigatório.");
                } else if ((idade >= 16 && idade < 18) || idade > 70) {
                    System.out.println("Apto a votar,Voto facultativo.");
                } else {
                    System.out.println("Você ainda não tem idade para votar.");
                }
            } else {
                System.out.println("Voto facultativo (analfabeto).");
            }
        } else {
            System.out.println("Você não está apto a votar (sem título de eleitor).");
        }

        entrada.close();
    }
}
