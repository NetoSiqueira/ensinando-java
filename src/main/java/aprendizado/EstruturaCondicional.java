package aprendizado;

public class EstruturaCondicional {
    public void estruturaCondicional(){
        System.out.println("Ola pessoal vamos aprender estrutura condicional no Java" +
                "\nAs estruturas mais utilizadas na liguagem Java sao:" +
                "\nIF/eles definido como SE e SENAO, onde tem uma condicao se nao for uma vai para outra" +
                "\nSwitch/case definido com escolha caso 1 ou caso 2 e etc" +
                "\nExemplos de cada uma:" +
                "\n\nUsando IF/else");

        int resposta = 10;
        if (resposta == 10) {
            System.out.println("A resposta é exatamente 10!");
        } else if (resposta > 10) {
            System.out.println("A resposta é maior que 10!");
        } else {
            System.out.println("A resposta é menor que 10!");
        }

        System.out.println("Usando Switch Case");

        int mes = 2;
        switch (mes) {
            case 1:
                System.out.println("O mês é janeiro");
                break;
            case 2:
                System.out.println("O mês é fevereiro");
                break;
            case 3:
                System.out.println("O mês é março");
                break;
            case 4:
                System.out.println("O mês a é abril");
                break;
            case 5:
                System.out.println("O mês é maio");
                break;
            case 6:
                System.out.println("O mês é junho");
                break;
            case 7:
                System.out.println("O mês é julho");
                break;
            case 8:
                System.out.println("O mês é agosto");
                break;
            case 9:
                System.out.println("O mês é setembro");
                break;
            case 10:
                System.out.println("O mês é outubro");
                break;
            case 11:
                System.out.println("O mês é novembro");
                break;
            case 12:
                System.out.println("O mês é dezembro");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }
}
