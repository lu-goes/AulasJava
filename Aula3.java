import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        Scanner leitorTxt = new Scanner (System.in);

        System.out.println("Entre com o nome dos funcionários:");

        String nome1= leitorTxt.nextLine();
        String nome2= leitorTxt.nextLine();
        String nome3= leitorTxt.nextLine();
        String nome4= leitorTxt.nextLine();
        String nome5= leitorTxt.nextLine();

        System.out.println("O nome dos funcionários são: " + nome1 +", " + nome2 +", "+ nome3+ ", "+nome4 + ", "+ nome5);

        leitorTxt.close();

    }
    
}
