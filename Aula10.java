import java.util.Scanner;

public class Aula10 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        FabricaCarro carro = new FabricaCarro();
        System.out.println(carro.nome);
        carro.andar();

        leitura.close();
        
    }
}

