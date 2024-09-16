import java.util.Random;
import java.util.Scanner;

public class Aula6{
    public static void main(String[] args) {
      
        Random aleatorio = new Random();
        Scanner leitura = new Scanner(System.in);
        final int sorteio = aleatorio.nextInt(10);
        
        System.out.println("Digite um numero: ");
        int numero = leitura.nextInt(), pontuacao = 30;

        if (numero < sorteio) {
            pontuacao = pontuacao - 10;
            System.out.println("Numero digitado é maior que o numero selecionado e você está com " + pontuacao +" pontos");
        
         
        } else if (sorteio > numero){
            pontuacao = pontuacao - 10;
            System.out.println("Numero digitado é menor que o numero selecionado"  + pontuacao +" pontos"  );

        } else {
            System.out.println("Você acertou com " + pontuacao +" pontos");
            return;
        }

        leitura.close();

    }
}