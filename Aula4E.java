import java.util.Scanner;

public class Aula4E {
    public static void main(String[] args) {
        
        // 1) Crie um programa em java que leia o nome do aluno e suas 5 notas e ao final retorne sua média

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = sc.nextLine();
        System.out.println("Digite sua primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota:");
        double nota2 = sc.nextDouble();
        System.out.println("Digite sua terceira nota:");
        double nota3 = sc.nextDouble();
        System.out.println("Digite sua quarta nota:");
        double nota4 = sc.nextDouble();
        System.out.println("Digite sua quinta nota:");
        double nota5 = sc.nextDouble();


        double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        System.out.println(media);

        sc.close();
    }
}
