import java.util.Scanner;

public class Aula4F {
    public static void main(String[] args) {
        Scanner leitorTexto = new Scanner (System.in);

        //3) Desenvolva um programa em Java que leia informações de 5 produtos: nome, quantidade e preço unitário. 
        //Calcule o preço total de cada produto e, ao final, retorne a soma total de todos os produtos e os nomes de todos os produtos registrados.

        String produto1, produto2, produto3, produto4, produto5;
        int qnt1, qnt2, qnt3, qnt4, qnt5;
        double precoUnit1, precoUnit2, precoUnit3, precoUnit4, precoUnit5;
        double soma = 0;

        System.out.println("Entre com o nome dos produtos:");
        produto1 = leitorTexto.nextLine();
        produto2 = leitorTexto.nextLine();
        produto3 = leitorTexto.nextLine();
        produto4 = leitorTexto.nextLine();
        produto5 = leitorTexto.nextLine();

        System.out.println("Digite a quantidade do " + produto1);
        qnt1 = leitorTexto.nextInt();
        System.out.println("Digite o valor do " + produto1);
        precoUnit1 = leitorTexto.nextInt();

        System.out.println("Digite a quantidade do " + produto2);
        qnt2 = leitorTexto.nextInt();
        System.out.println("Digite o valor do " + produto2);
        precoUnit2 = leitorTexto.nextInt();

        System.out.println("Digite a quantidade do " + produto3);
        qnt3 = leitorTexto.nextInt();
        System.out.println("Digite o valor do " + produto3);
        precoUnit3 = leitorTexto.nextInt();

        System.out.println("Digite a quantidade do " + produto4);
        qnt4 = leitorTexto.nextInt();
        System.out.println("Digite o valor do " + produto4);
        precoUnit4 = leitorTexto.nextInt();

        System.out.println("Digite a quantidade do " + produto5);
        qnt5 = leitorTexto.nextInt();
        System.out.println("Digite o valor do " + produto5);
        precoUnit5 = leitorTexto.nextInt();

        double total1 = qnt1*precoUnit1;
        double total2 = qnt2*precoUnit2;
        double total3 = qnt3*precoUnit3;
        double total4 = qnt4*precoUnit4;
        double total5 = qnt5*precoUnit5;

        System.out.println(total1);
        System.out.println(total2);
        System.err.println(total3);
        System.err.println(total4);
        System.out.println(total5);

        leitorTexto.close();
    }
}


