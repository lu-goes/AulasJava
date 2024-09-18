import java.util.Random;
import java.util.Scanner;

public class Aula7B {
    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        Scanner leitura = new Scanner (System.in);
        final int sorteio = aleatorio.nextInt(10);
        int pontuacao = 50;
        int numero;

        System.out.println("Digite o número: ");

        while (pontuacao>0) {
            
            numero = leitura.nextInt();
            if (numero != sorteio) {
                pontuacao = pontuacao - 10;
                System.out.println("Você está com "+ pontuacao +" pontos");
                
            } else{
                System.out.println("Parabéns você acertou com "+ pontuacao +" pontos");
                leitura.close();
                return;
            }
        }

        System.out.println("Você perdeu!");

        leitura.close();
        return;
    }
}
