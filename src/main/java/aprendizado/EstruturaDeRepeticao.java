package aprendizado;

import java.util.Scanner;

public class EstruturaDeRepeticao {
    public void estruturaDeRepeticao(){
        System.out.println("Ola pessoal vamos aprender estrutura de repetição no Java" +
                "\nEstruturas de repetição, também conhecidas como loops (laços), são utilizadas para executar repetidamente uma instrução ou bloco de instrução enquanto determinada condição estiver sendo satisfeita.\n" +
                "\n" +
                "As principais estruturas de repetição na maioria das linguagens são o for e o while." +
                "\n Exemplo com for");
        for (int i = 0; i <= 10; i++) {
            System.out.println("A variável i agora vale " + i);
        }

        System.out.println("Exemplo com While");

        Scanner in = new Scanner(System.in);
        int numero = -1;
        while (numero != 10) {
            // enquanto a variável não for 10, o trecho de código será repetido
            System.out.println("Digite um número: ");
            numero = in.nextInt();
            if (numero == 10) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Você errou :(");
            }
        }
    }

}
