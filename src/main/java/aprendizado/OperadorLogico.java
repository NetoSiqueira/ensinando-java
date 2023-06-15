package aprendizado;

public class OperadorLogico {
    public void operadorLogico(){
        System.out.println("Ola pessoal vamos aprender os Operadores Logicos e saida no Java" +
                "\nOs mais usados na liguagem Java é o E e OU. Representados dessa forma" +
                "\n&& E" +
                "\n|| OU" +
                "\n Vamos ver exemplo de como se usa");
        System.out.println("int quantidadeAnos = 5;\n" +
                "int horasTrabalhadas = 40;\n" +
                "int valorHora = 50;\n" +
                "int salario = 0;\n" +
                "\n" +
                "if (quantidadeAnos <= 1) {\n" +
                "    salario = 1500 + (valorHora * horasTrabalhadas);\n" +
                "} else if ((quantidadeAnos > 1) && (quantidadeAnos < 3)) {\n" +
                "    salario = 2000 + (valorHora * horasTrabalhadas);\n" +
                "} else {\n" +
                "    salario = 3000 + (valorHora * horasTrabalhadas);\n" +
                "}");
        System.out.println("Essa seria um exemplo onde se pode definir o E e OU");
        System.out.println("Na pratica como esse exemplo executaria:");
        int quantidadeAnos = 5;
        int horasTrabalhadas = 40;
        int valorHora = 50;
        int salario = 0;

        if (quantidadeAnos <= 1) {
            salario = 1500 + (valorHora * horasTrabalhadas);
        } else if ((quantidadeAnos > 1) && (quantidadeAnos < 3)) {
            salario = 2000 + (valorHora * horasTrabalhadas);
        } else {
            salario = 3000 + (valorHora * horasTrabalhadas);
        }
        System.out.println(salario);
    }
}
