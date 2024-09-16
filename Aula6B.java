import java.util.Scanner;

public class Aula6B {
    public static void main(String[] args) {
        
        // Crie um pograma em Java que, ao receber um estado do usuário como 
        //entrada exiba uma ou mais cidades pertencentes ao estado selecionado.

        String [] resposta = {
            "São Paulo, Atibaia, Carapicuiba, Cotia",
            "Angra dos Reis, Arraial do cabo, Niterói, Paraty",
            "Araucária, Londrina, Ponta Grossa",
            "Caxias do sul, Porto Alegre, Pelotas",
            "Belo Horizonte, Juiz de Fora",
            "Vitória, Vila Velha, Linhares",
            "Cuiabá",
            "Goiânia, Anápolis, Catalão",
            "Olinda, Alagoinha, Camaragibe ",
            "Salvador, Jacobina, Porto Seguro, Juazeiro"};

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um estado: ");
        switch (leitura.nextLine()) {
            case "São Paulo":
                System.out.println(resposta[0]);
                break;
            
            case "Rio de Janeiro":
                System.out.println(resposta[1]);
                break;
            
            case "Paraná":
                System.out.println(resposta[2]);
                break;
            
            case "Rio Grande do Sul":
                System.out.println(resposta[3]);
                break;   

            case "Minas Gerais":
                System.out.println(resposta[4]);
                break;

            case "Espirito Santos":
                System.out.println(resposta[5]);
                break; 
                
            case "Mato Grosso":
                System.out.println(resposta[6]);
                break;   

            case "Goiáis":
                System.out.println(resposta[7]);
                break; 
                
            case "Pernambuco":
                System.out.println(resposta[8]);
                break; 

            case "Bahia":
                System.out.println(resposta[9]);
                break; 

            default:
                 System.out.println("Estado Inválido");
                break;
        }

        leitura.close();

    }
}
