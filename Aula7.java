import java.util.Random;
import java.util.Scanner;

public class Aula7{
    public static void main(String[] args) {
      
        Random aleatorio = new Random();
        Scanner leitura = new Scanner(System.in);
        final int sorteio = aleatorio.nextInt(10);
        int pontuacao = 50;
        int numero;
         
        System.out.println("Digite um numero: ");
        while (pontuacao>0) {
            
            numero = leitura.nextInt();
            if (numero < sorteio) {
                pontuacao = pontuacao - 10;
                System.out.println("Numero digitado é maior que o numero selecionado e você está com " + pontuacao +" pontos");
            
             
            } else if (sorteio > numero){
                pontuacao = pontuacao - 10;
                System.out.println("Numero digitado é menor que o numero selecionado"  + pontuacao +" pontos"  );
    
            } else {
                System.out.println("Você acertou com " + pontuacao +" pontos");
                leitura.close();
                return;
            }
    
        }
        
        System.out.println("Você perdeu!");
        leitura.close();

    }
}