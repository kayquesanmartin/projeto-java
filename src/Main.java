public class Main {
    public static void main(String[] args) {
        ////// VARIÁVEIS E MÉTODOS //////

        // final informa que a variável não pode ser alterada.
        final String BR = "Brasil";
        //BR = "Brazil"; -> Apresenta erro

        // Em alguns momentos as variaveis terão convenções diferentes de declaração.
        int ano = 2024;
        double PI = 3.14;
        int ESTADOS_BRASILEIROS = 27;
        int ANO_2000 = 2000;

//        // Declarações inválidas
//        int numero&um = 1; // Os únicos símbolos permitidos são _ e $
//        int 1numero = 1; // Uma variável não pode começar com numérico
//        int numero um = 1; // Não pode ter espaço no nome da variável
//        int long 1; // long faz parte das palavras reservadas da linguagem

        // Declaração válida de veriáveis
        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1;
        int longo = 1;

        String primeiroNome = "Kayque";
        String segundoNome = "Sanmartin";

        // Variavel para receber o retorno do método.
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    // Método
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
