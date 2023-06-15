package aprendizado;

import java.util.Scanner;

public class OperadoresAritmeticos {

    public void OperadoresAritmeticos(){
        int a,b;
        float soma, div, mult, rest;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ola pessoal vamos aprender os Operadores Aritmeticos e Classe Math no Java" +
                "\n Operadores Aritmeticos mais usados nas linguagem como no java são:" +
                "\n Soma, subtração, divisão, multiplicação e Resto e na linguagem correspondem a essa forma" +
                "\n A + B, A / B, A * B, A % B" +
                "\n A Classe Math ela contem as funçoes matematicas, como:" +
                "\n Pi, raiz quadrada, potencia e etc. É nela que pode ser chamado para fazer essas funções" +
                "\nExemplos dessa operações mostradas:" +
                "\n\n Aritmetica:");

        System.out.println("Digite um numero: ");
        a = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        b = scanner.nextInt();

        soma = a + b;
        div = a / b;
        mult = a * b;
        rest = a % b;

        System.out.println(a + " + " + b + " = " + soma );
        System.out.println(a + " / " + b + " = " + div );
        System.out.println(a + " * " + b + " = " + mult );
        System.out.println(a + " % " + b + " = " + rest );

        System.out.println("\n\nClass Math");
        System.out.println("Raiz quadrada: " +Math.sqrt(a));
        System.out.println("PI: " +Math.PI);
        System.out.println("Potencia: "+Math.pow(a,b));

        System.out.println("\n");

        System.out.println("ATE O PROXIMO APRENDIZADO ");
    }
}
