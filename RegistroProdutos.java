public class RegistroProdutos {

    private String nome;
    private double preco;
    private int quantidade;

    public RegistroProdutos (String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getInt(){
        return quantidade;
    }

    private class ArmazenarProdutos{
        private RegistroProdutos[] produtos;
        private int indiceAtual;

        public ArmazenarProdutos(){
            produtos = new RegistroProdutos[10];
            indiceAtual = 0;
        }

    }

    public void adcionarProdutos(String nome, double preco, int quantidade){
        if (indiceAtual < 10) {
            produtos[indiceAtual] = new RegistroProdutos(nome, preco, quantidade);
            indiceAtual++;
            
        }else{
            System.out.println("Limite de produtos atingidos.");
        }

    }

    public int calcularTotal(){
        int quantidadeTotal = 0;
        for (int i = 0; i < indiceAtual; i++) {
            quantidadeTotal += produtos[i].getQuantidades();
        }
        return quantidadeTotal;
    }


    
}
