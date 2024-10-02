import java.util.Scanner;

public class FabricaCarro {
    
    public String marca;
    public String cor;
    public int ano;
    public String nome;
    public void andar(){
        System.out.println("Seu carro está andando");
    }
    
    public FabricaCarro(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a marca do carro:");
        this.marca = leitura.nextLine();
        System.out.println("Digite a cor do carro:");
        this.cor = leitura.nextLine();
        while (true) {
            try{ 
                Scanner temp = new Scanner(System.in);
                System.out.println("Digite o ano do carro:");
                this.ano = temp.nextInt();
                temp.close();
                break;
            }
            catch(Exception e){
                System.out.println("Digite um valor válido");
                continue;             
            }
            
        }
        

        leitura.close();
    
    }
    
    
   
}
