import java.util.Random;
import java.util.Scanner;

public class Aula5J{
    public static void main(String[] args) {
        
        //Atribuindo os valores iniciais
        Random aleatorio = new Random();
        Scanner leitura = new Scanner(System.in);
        final int sorteio = aleatorio.nextInt(10);
        var teste = sorteio;
        System.out.println("O número do sorteio é: " + teste);
        
        // Obtendo valores com o usuário
        System.out.println("Digite um numero: ");
        int numero = leitura.nextInt(), pontuacao = 30;

        // Testes de pontuação

        if (numero == sorteio) {
            System.out.println("Parabéns, você acertou com " + pontuacao + " pontos");
            leitura.close();
            return;
        
         
        } else {
            pontuacao = pontuacao - 10;
            System.out.println("Errou, você está com " + pontuacao + " pontos");
            System.out.println("Digite novamente: ");
            numero = leitura.nextInt();

            if(numero == sorteio) {
                System.out.println("Parabéns, você acertou com " + pontuacao + " pontos");
                leitura.close();
                return;
            } else {
            pontuacao = pontuacao - 10;
            System.out.println("Errou, você está com " + pontuacao + " pontos");
            System.out.println("Digite novamente: ");
            numero = leitura.nextInt();
            }
            if(numero == sorteio) {
                System.out.println("Parabéns, você acertou com " + pontuacao + " pontos");
                leitura.close();
                return;
            } else{
            pontuacao = pontuacao - 10;
            System.out.println("Perdeu, você está com " + pontuacao + " pontos");
            }
        
        }
        
    
        leitura.close();
    }
}