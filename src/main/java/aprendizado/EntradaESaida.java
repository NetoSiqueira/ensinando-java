package aprendizado;

import java.util.Scanner;

public class EntradaESaida {
    public void aprendendoEntradaSaida(){
        String ola;
        Scanner texto = new Scanner(System.in);
        System.out.println("Ola pessoal vamos aprender os Comandos de entrada e saida no Java");
        System.out.println("O comando de entrada no Java é chamado de Scanner");
        System.out.println("Para inicializar ele seria assim: ");
        System.out.println("Scanner <Nome> = new Scanner(System.in)");
        System.out.println("Comando de saida no Java é chamado Print");
        System.out.println("Podendo ser chamado assim: ");
        System.out.println("System.out.println();");

        System.out.println("Vamos ver um exemplo\n\n");

        System.out.println("Digite um texto");
        ola = texto.nextLine();
        System.out.println(ola);
        System.out.println("\n");

        System.out.println("ATE O PROXIMO APRENDIZADO ");
    }
}
