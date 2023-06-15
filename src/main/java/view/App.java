package view;



import java.util.Scanner;

public class App {
    public void App(){

        int menu;
        Scanner scanner = new Scanner(System.in);
        Menu menu1 = new Menu();
        boolean fim = true;

        do {
            System.out.println("-----------------------------------------------");
            System.out.println("          A P R E N D E N D O J A V A          ");
            System.out.println("Qual modulo deseja aprender ?                  ");
            System.out.println("[1] Comandos de Entrada e Saida                ");
            System.out.println("[2] Tipos Primitivos e Manipulação de Dados    ");
            System.out.println("[3] Operadores Aritméticos e Classe Math       ");
            System.out.println("[4] Operadores Lógicos                         ");
            System.out.println("[5] Operadores Relacionais                     ");
            System.out.println("[6] Estruturas Condicionais                    ");
            System.out.println("[7] Estruturas de Repetição                    ");
            System.out.println("[8] Vetores (Array)                            ");
            System.out.println("[9] Métodos (Funções)                          ");
            System.out.println("[10] Sair                                      ");
            System.out.println("-----------------------------------------------");
            menu = scanner.nextInt();
            if (menu != 10)
                 menu1.menu(menu);
            else
                fim = false;

        }while(fim != false);

        System.out.println("Bye bye");
    }
}
