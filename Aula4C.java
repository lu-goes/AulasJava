public class Aula4C {
    public static void main(String[] args) {
        int numeroNaoQuebrado = 10;
        double numeroQuebrado = 7.3;

        // Calculos
        // soma
        var resultado = numeroQuebrado + numeroNaoQuebrado;
        System.out.println(resultado);

        // subtração
        resultado = numeroQuebrado - numeroNaoQuebrado;
        System.out.println(resultado);

        // Multiplicação
        resultado = numeroQuebrado * numeroNaoQuebrado;
        System.out.println(resultado);

        // Divisão
        resultado = numeroQuebrado / numeroNaoQuebrado;
        System.out.println(resultado);

        // variáveis de texto

        char letra;
        String texto;
        boolean teste;

        letra = 'A';
        texto = "ABC - ABCdario";

        System.out.println(texto.charAt(4));
        System.out.println(texto+texto+texto);

        teste = letra =='A';
        System.out.println(teste);
        teste = resultado > 1;
        System.out.println(teste);
        teste = resultado < 10; 
        System.out.println(teste);
        teste = resultado >= 5;
        System.out.println(teste);

        // Crie um programa em java que leia o nome do aluno e suas 5 notas e ao final retorne sua média

    }
}
