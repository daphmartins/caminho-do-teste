package metodos;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Calculadora: ");
        Calculadora.soma(1, 2);
        Calculadora.multiplicacao(20, 10);
        Calculadora.divisao(3, 6);
        Calculadora.subtracao(13.4, 50.6);


        // Mensagem
        System.out.println("\nMensagens de bom dia: ");
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);

        // Empréstimo
        System.out.println("\nEmpréstimos: ");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 0);

    }
}