package exer4_fibonacci;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.io.IOException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int proximo, anterior = 0, atual = 1;

        System.out.print(anterior + " " + atual);
        for (int i = 2; i < N; i++) {
            proximo = anterior + atual;
            anterior = atual;
            atual =  proximo;
            System.out.print(" " + atual);
        }
        System.out.println();
    }

}