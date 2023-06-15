package aprendizado;

import java.util.Calendar;
import java.util.Scanner;

public class TiposPrimitivos {
    public void TiposPrimtivos(){
        System.out.println("Ola pessoal vamos aprender os Tipos Primitivos e Manipulação de Dados no Java" +
                "\n Vamos focar em 4 que são os principais" +
                "\n O Primeiro e o inteiro que no java e em outras linguagem e representado pelo int. Exemplo:" +
                "\n int inteiro = 2;" +
                "\n O Segundo e o Reais que no java e outras linguagem e representado pelo float. Exemplo:" +
                "\n float reais = 2.5" +
                "\n O Terceiro e o Caracteres que no java e outras linguagem e representado pelo string. Exemplo:" +
                "\n String olaMundo = Ola mundo" +
                "\n E o Quarto e o Booleano que no java e outras linguagem e representado pelo boolean. Exemplo:" +
                "\n boolean verdade = true" +
                "\n boolean falso = false" +
                "\n\n Agora vamos ver como se aplica esses tipos em um programa?");

        int idade, anoNasc, mesNasc, idadeCorreta;
        boolean resultado = false;
        Calendar cal = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        int anoAtual = cal.get(Calendar.YEAR);
        int mesAtual = cal.get(Calendar.MONTH);

        System.out.println("Em que ano voce nasceu? ");
        anoNasc = scanner.nextInt();

        System.out.println("Em que mes e seu aniversario?");
        mesNasc = scanner.nextInt();
        if ( mesNasc < mesAtual ) {
            idade = anoAtual - anoNasc;
            System.out.println("Sua idade e: " + idade + " anos");
        }else {
            idade = (anoAtual - anoNasc) - 1;
            System.out.println("Sua idade e: " + idade + " anos");
        }

        System.out.println("Sua idade esta certo?" +
                "\n [1] Sim" +
                "\n [2] Nao");
        idadeCorreta = scanner.nextInt();

        if (idadeCorreta == 1){
            resultado = true;
            System.out.println("Sua idade é " + resultado);
        }
        else
            System.out.println("Sua idade é " + resultado);

        System.out.println("\n");

        System.out.println("ATE O PROXIMO APRENDIZADO ");
    }
}
