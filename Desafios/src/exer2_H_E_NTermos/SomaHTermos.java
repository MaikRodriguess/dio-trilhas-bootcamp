package exer2_H_E_NTermos;

import java.util.Scanner;

public class SomaHTermos {
    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            h += (double) 1.0 / i;
        }
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        System.out.println(String.format("%.0f",h));
//        System.out.printf("%.0f", h);
    }
}