import java.util.Scanner;

public class Exercicio1809A {
    public static void main(String[] args) {
        
        //2) Calcule a média das duas notas de um estudante.

        Scanner sc = new Scanner(System.in);
        //System.out.println("Digite sua primeira nota: ");
        //double nota1 = sc.nextDouble();

        //System.out.println("Digite sua segunda nota:");
        //double nota2 = sc.nextDouble();

        //double media = (nota1 +  nota2)/2;
        //System.out.println("Sua média é: " + media);

        //3) Crie um sistema que leia a temperatura e faça a conversão para:

        //System.out.println("Digite a temperatura: ");
        //double temperatura = sc.nextDouble();
        //double fahrenheit = (temperatura * 9/5) + 32;
        //double celsius = (temperatura - 32) * 5/9;

        //System.out.println("A temperatura em Celsius é: " + celsius);
        //System.out.println("A temperatura em fahrenheit é:" + fahrenheit);

        //4) Desenvolva um programa em Java que verifique se uma pessoa é maior ou menor de idade, ainda se já é idoso ou não.

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18 ) {
            if(idade >= 65){
                System.out.println("Você é idoso(a)");
            }
            else{
                System.out.println("Você é maior de idade");
            }
            sc.close();
            return;
        } else if (idade > 65) {
            System.out.println("Você é idoso(a) ");
            sc.close();
            return;
        }else{
            System.out.println("Você é menor de idade");
            
        }


        sc.close();
        return;
    }
}
