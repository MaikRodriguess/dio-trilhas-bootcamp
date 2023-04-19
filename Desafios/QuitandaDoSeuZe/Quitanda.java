package desafio.QuitandaDoSeuZe;// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.*;

public class Quitanda {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:

        Quitanda importClass = new Quitanda();
        double valorMorangos = importClass.calculoFrutas(morangos, macas);
        System.out.println(valorMorangos);

    }

    public double calculoFrutas(int morangos, int macas) {
        double valorMorangosAte5kg = 2.50;
        double valorMorangosMaior5kg = 2.20;
        double valorMacasAte5kg = 1.80;
        double valorMacasMaior5kg = 1.50;
        int kgTotaisFrutas = morangos + macas;



        double valorDosMorangos;
        double valorDasMacas;

        //Morangos
        if( morangos <= 5 ){
            valorDosMorangos = morangos * valorMorangosAte5kg;
        } else  {
            valorDosMorangos = morangos * valorMorangosMaior5kg;
        }
        // Maçãs
        if( macas <= 5 ){
            valorDasMacas = macas * valorMacasAte5kg;
        } else  {
            valorDasMacas = macas * valorMacasMaior5kg;
        }
        double valorTotalFrutas = valorDosMorangos + valorDasMacas;

        // Desconto
        if(kgTotaisFrutas > 8 || valorTotalFrutas > 25.00){
            valorTotalFrutas = valorTotalFrutas * (1 - 0.10);
        }

        return valorTotalFrutas;
    }



}