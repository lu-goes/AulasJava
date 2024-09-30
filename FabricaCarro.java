import java.util.Scanner;

public class FabricaCarro {
    
    public String marca;
    public String cor;
    public int ano;
    public String nome;
    public FabricaCarro(){
        Scanner leitura = new Scanner(System.in);
        this.nome = leitura.nextLine();

        leitura.close();
    
    }
    
    
   
}
