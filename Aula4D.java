import java.util.Scanner;

public class Aula4D {
    public static void main(String[] args) {
        
        Scanner leitorTxt = new Scanner(System.in);

        // 2) Calcule a soma das médias dos 5 estudantes e, ao final, retorne essa soma e os nomes dos estudantes.

        System.out.println("Entre com o nome dos estudantes: ");
        String aluno1 = leitorTxt.nextLine();
        String aluno2 = leitorTxt.nextLine();
        String aluno3 = leitorTxt.nextLine();
        String aluno4 = leitorTxt.nextLine();
        String aluno5 = leitorTxt.nextLine();

        System.out.println("Entre com as notas das médias: ");
        
        double mediaAluno1 = leitorTxt.nextDouble();
        double mediaAluno2 = leitorTxt.nextDouble();
        double mediaAluno3 = leitorTxt.nextDouble();
        double mediaAluno4 = leitorTxt.nextDouble();
        double mediaAluno5 = leitorTxt.nextDouble();

        double somaMedia = mediaAluno1 + mediaAluno2 + mediaAluno3 + mediaAluno4 + mediaAluno5;
        double resultado = somaMedia;

        System.out.println("A soma da média do(a): " + aluno1 + ", " + aluno2 + ", "+ aluno3 + ", " + aluno4 + " e " + aluno5 );
        System.out.printf("%2f\n",resultado);


        leitorTxt.close();
    }
}
