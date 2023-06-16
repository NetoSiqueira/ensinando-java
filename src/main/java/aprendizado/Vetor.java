package aprendizado;

import java.util.Scanner;

public class Vetor {
    public void vetor(){
        System.out.println("Ola pessoal vamos aprender vetor no Java" +
                "\nVetores são estruturas de dados que armazenam usualmente uma quantidade fixa de dados " +
                "\nde um certo tipo; por esta razão, também são conhecidos como estruturas homogêneas de dados." +
                "\nVamos ver um exemplo como e usado vetor");



        int num, pos, cont = 1, remov, ord;
        int vetor[] = {0, 0 , 0, 0, 0, 0, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite um numero");
            num = scanner.nextInt();
            System.out.println("Digite a posição");
            pos = scanner.nextInt();

            vetor[pos]= num;
            System.out.println("Deseja remover? [1]Sim/[2]Nao");
            remov=scanner.nextInt();
            if (remov == 1){
                System.out.println("Digite a posição");
                pos = scanner.nextInt();
                vetor[pos]=0;
            }

            System.out.println("Deseja ordenar? [1]Sim/[2]Nao");
            ord = scanner.nextInt();
            if (ord ==1) {
                for (int i = 0; i < vetor.length; i++) {
                    if (vetor[i] != 0) {
                        for (int j = i + 1; j < vetor.length; j++) {
                            if (vetor[j] == 0) {
                                vetor[j] = vetor[i];
                                vetor[i] = 0;
                            }
                        }
                    }

                }
            }
            for (int i = 0; i < vetor.length; i++){
                System.out.println(vetor[i]);
            }

            System.out.println("Deseja continuar? [1]Sim/[0]Nao");
            cont = scanner.nextInt();
        }while (cont !=0);
    }
}
