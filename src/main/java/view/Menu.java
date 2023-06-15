package view;

import aprendizado.EntradaESaida;
import aprendizado.OperadorRelacional;
import aprendizado.OperadoresAritmeticos;
import aprendizado.TiposPrimitivos;

public class Menu {
    public void menu(int menu){


        EntradaESaida ex1 = new EntradaESaida();
        TiposPrimitivos ex2 = new TiposPrimitivos();
        OperadoresAritmeticos ex3 = new OperadoresAritmeticos();
        OperadorRelacional ex5 = new OperadorRelacional();

        switch (menu){
            case 1:
                ex1.aprendendoEntradaSaida();
                break;
            case 2:
                ex2.TiposPrimtivos();
                break;
            case 3:
                ex3.OperadoresAritmeticos();
                break;
            case 4:

                break;
            case 5:
                ex5.operdorRelacional();
                break;
            case 6:
                System.out.println("Ainda não estudado :P ");
                break;
            case 7:
                System.out.println("Ainda não estudado :P ");
                break;
            case 8:
                System.out.println("Ainda não estudado :P ");
                break;
            case 9:
                System.out.println("A Forma que foi apresentado se base em Funções :P ");
                break;
            case 10:


                break;
            default:
        }

    }
}
