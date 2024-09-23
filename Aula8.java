import java.util.Scanner;

public class Aula8 {
    public static void main(String[] args) {
        
        // Faça a leitura de 30 pessoas e informe em numeros pares para os registros

        String [] pessoa = new String[30];
        Scanner leitura = new Scanner(System.in);
        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Digite o nome");
            pessoa[i] = leitura.nextLine();
        }

        for (int i = 1; i < pessoa.length; i=i+2) {
            System.out.println(pessoa[i]);
            
        }
        
        
        leitura.close();

    }
}
