import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        int anoN, anoA, idade;

        Scanner leia = new Scanner(System.in);

        System.out.println("Nome: ");
        nome = leia.nextLine();

        System.out.println("Nasimento: ");
        anoN = leia.nextInt();

        if (anoN > 2023) {
            System.out.println("[ERRO]: idade inválida.");
            System.exit(0);
        }

        System.out.println("Ano atual: ");
        anoA = leia.nextInt();

        idade = anoA - anoN;
        System.out.println("Seja bem vindo, "+ nome + "! sua idade é: " + idade);

        if (idade <= 17) {
            System.out.println("Você é menor de idade.");
        } 
        else if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        }
    }
}
