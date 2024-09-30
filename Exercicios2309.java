import java.util.Scanner;

public class Exercicios2309 {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);

        // 2)Crie um programa em Java que imprima a tabuada do 2, até 100 vezes.

        for (int i = 1; i <= 100; i++) {
            System.out.println("2 x " + i + " = " + (2*i));
            
        }

        // 3) Crie um sistema em Java para a leitura dos 30 usuários na empresa Davi's Model.

        String [] usuario = new String[30];
        for (int i = 0; i < usuario.length; i++) {
            System.out.println("Digite o nome do usuário: ");
            usuario[i] = leitura.nextLine();
            
        }

        // 4) Crie um programa em Java que imprima apenas os múltiplos de 3 e 7, até 100 vezes.

        for (int i = 7; i <= 100; i++) {
            if (i % 3 ==0 || i % 7 == 0) {
                System.out.println(i);
            }
            
        }

        // 5) Faça um algoritmo para ler 50 números e armazenar em um vetor VET, 
        //verificar e escrever se existem números repetidos no vetor VET e em que posições se encontram.

        int [] VET = new int [50];
        System.out.println("Digite 50 números: ");
        for (int i = 0; i < VET.length; i++) {
            VET [i] = leitura.nextInt();
        }
        

        leitura.close();
    }
}
