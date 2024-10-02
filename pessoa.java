public class pessoa {

    public String nome;
    public String sobrenome;
    public int ano;
    public char sexo;

    public pessoa(String nome, String sobrenome, int ano, char sexo){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ano = ano;
        this.sexo = sexo;
    }

    public int calcularIdade(){
        int anoAtual = 2024;
        return anoAtual - this.ano;
    }

    public void exibir(){
        System.out.println("Nome: "+ nome + " " + sobrenome);
        System.out.println("Ano de Nascimento: "+ ano );
        System.out.println("Sexo: "+ sexo );
        System.out.println("Idade: "+ calcularIdade() + " anos");
    }
   
    
}
