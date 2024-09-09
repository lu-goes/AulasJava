// crie um jogo que o usuário digite um numero e no final verifica se acertou o numero aleatorio

import java.util.Random;
import java.util.Scanner;

public class Aula4{
    public static void main (String [] args){
        Random aleatorio = new Random();
        Scanner lendoNumero = new Scanner(System.in);

        final int sorteio = aleatorio.nextInt(10);

        System.out.println("Digite um valor para jogar");
        int numeroDoUsuario = lendoNumero.nextInt();
        System.out.println(numeroDoUsuario==sorteio);

        System.out.println("Digite um valor para jogar");
        numeroDoUsuario = lendoNumero.nextInt();
        System.out.println(numeroDoUsuario==sorteio);

        System.out.println("Digite um valor para jogar");
        numeroDoUsuario = lendoNumero.nextInt();
        System.out.println(numeroDoUsuario==sorteio);
        
        System.out.println("Numero aleatorio: " + sorteio + " Numero digitado: " + numeroDoUsuario);

        lendoNumero.close();
    }
}