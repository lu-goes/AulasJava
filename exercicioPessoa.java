import java.util.Scanner;

public class exercicioPessoa {
    public static void main(String[] args) {
        
        //1)Implemente uma classe em Java denominada Pessoa com os atributos nome (String), 
        // sobrenome (String), idade (int) e sexo (char). Inclua um método para calcular e retornar a idade da pessoa.

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.println("Digite o ano do seu nascimento: ");
        int ano = sc.nextInt();

        System.out.println("Digite o sexo(M/F): ");
        char sexo = sc.next().charAt(0);

        pessoa pessoa = new pessoa(nome, sobrenome, ano, sexo);
        pessoa.exibir();



        sc.close();
    }
    
}
