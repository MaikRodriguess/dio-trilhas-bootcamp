/*
* Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
  Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e
* em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 - Fevereiro e etc).
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TemperaturaMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> meses = new ArrayList<>();
        List<Double> temperaturas = new ArrayList<>();

        meses.addAll(Arrays.asList("Janeiro", "Fevereiro", "Março","Abril","Maio","Junho"));

        double soma = 0;
        for ( String mes : meses) {
            System.out.println("Digite a temperatura do mês de " + mes + ": ");
            double temperatura = (double) scan.nextDouble();
            temperaturas.add(temperatura);
            soma += temperatura;
        }

        double media = soma / meses.size();

        System.out.println("As temperaturas do semestre: ");
        for ( int i = 0; i < meses.size();i++ ) {
            System.out.println(meses.get(i) + " = " + temperaturas.get(i));
        }

        System.out.printf("A média: %.2f", media);
    }

}
