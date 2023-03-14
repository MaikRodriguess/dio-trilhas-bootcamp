package dio.digitalinnovation;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 2);
        Calculadora.subtracao(10, 5 );
        Calculadora.multiplicacao(5, 2);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        Emprestimo.calcular(10, 2);
        Emprestimo.calcular(5, 3);
    }



}
