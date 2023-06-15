package aprendizado;

public class OperadorRelacional {
    public void operdorRelacional(){
        System.out.println("Ola pessoal vamos aprender os Operadores Relacionais e saida no Java" +
                "\nOperadores mais usados na linguagem java são:" +
                "\nA > B Maior que b" +
                "\nA < B Menor que b" +
                "\nA >= B Maior ou igual que b" +
                "\nA <= B Menor ou igual que b" +
                "\nA == B Igual a B" +
                "\nA != B Diferente de B" +
                "\nVou mostrar alguns exemplos aplicados" +
                "\nExemplos dos operadores de igualdade" +
                "\n Onde A = 1  e B = 2 ");

        int valorA = 1;
        int valorB = 2;

        if(valorA == valorB){
            System.out.println("Valores iguais");
        } else {
            System.out.println("Valores diferentes");
        }

        System.out.println("Exemplos operadores relacionais:");

         valorA = 1;
         valorB = 2;

        if (valorA > valorB) {
            System.out.println("maior");
        }

        if (valorA >= valorB) {
            System.out.println("maior ou igual");
        }

        if (valorA < valorB) {
            System.out.println("menor");
        }

        if (valorA <= valorB) {
            System.out.println("menor ou igual");
        }
    }
}
