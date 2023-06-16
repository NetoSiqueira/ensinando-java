package view;

import aprendizado.*;

public class Menu {
    public void menu(int menu){


        EntradaESaida ex1 = new EntradaESaida();
        TiposPrimitivos ex2 = new TiposPrimitivos();
        OperadoresAritmeticos ex3 = new OperadoresAritmeticos();
        OperadorRelacional ex5 = new OperadorRelacional();
        EstruturaCondicional ex6 = new EstruturaCondicional();
        EstruturaDeRepeticao ex7 = new EstruturaDeRepeticao();
        Vetor ex8 = new Vetor();

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
                ex6.estruturaCondicional();
                break;
            case 7:
                ex7.estruturaDeRepeticao();
                break;
            case 8:
                ex8.vetor();
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
