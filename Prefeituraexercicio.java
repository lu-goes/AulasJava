import java.util.Scanner;

public class Prefeituraexercicio {
    public static void main(String [] args){

        // 1) A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. 
        // Faça um algoritmo para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
            //a. Média de salário da população;
            //b. Média do número de filhos;
            //c. Maior salário dos habitantes;
            //d. Percentual de pessoas com salário menor que R$ 150,00
        // Obs.: O final das leituras dos dados se dará com a entrada de um “salário negativo”.

        Scanner sc = new Scanner(System.in);

        double salario, somaSalarios = 0;
        int filhos, somaFilhos = 0;
        int habitantes = 0;

        double maiorSalario = 0;
        int pessoasSalarioBaixo = 0;

        while (true) {
            System.out.println("Digite o salário (um valor negativo para terminar): ");
            salario = sc.nextDouble();

            if (salario < 0) {
                break;
                
            }

            System.out.println("Digite o número de filhos: ");
            filhos = sc.nextInt();

            somaSalarios += salario;
            somaFilhos += filhos;
            habitantes ++;

            if (salario > maiorSalario) {

                maiorSalario = salario;
                
            }
            if (salario < 150) {

                pessoasSalarioBaixo++;
                
            }
            if (habitantes>0) {

                double mediaSalarios = somaSalarios/habitantes;
                double mediaFilhos = (double) somaFilhos / habitantes;
                double percentualSalarioBaixo = (double) pessoasSalarioBaixo / habitantes * 100;

                System.out.println("Média de salários da população: R$ " + mediaSalarios);
                System.out.println("Média do número de filhos: " +  mediaFilhos);
                System.out.println("Maior salário: R$ " + maiorSalario);

                System.out.println("Percentual de pessoas com salário menor que R% 150,00: "+ percentualSalarioBaixo + "%");
                
            }else{
                System.out.println("Nenhum dado foi inserido.");
            }
            
        }

        sc.close();
    }

}
