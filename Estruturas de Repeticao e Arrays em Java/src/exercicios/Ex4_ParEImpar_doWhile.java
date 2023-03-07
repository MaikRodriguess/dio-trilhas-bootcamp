package exercicios;

import java.util.Scanner;

public class Ex4_ParEImpar_doWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;

        int quantNumerosPar = 0, quantNumeroImpar = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();


        int contador = 0;
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantNumerosPar++;
            else quantNumeroImpar++;

            contador++;
        }while (contador < quantNumeros);
        System.out.println("Quantidade de números pares: " + quantNumerosPar);
        System.out.println("Quantidade de números impares: " + quantNumeroImpar);
    }
}
