package one.digitalinnovation;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
       Stack<Carro> stackCarros = new Stack<>();

       // Inserindo na pilha
       stackCarros.push(new Carro("Ford"));
       stackCarros.push(new Carro("Toyota"));
       stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        // Retirando da pilha
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        // Exibe mão não retira
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        // Testa se a lista está vazia
        System.out.println(stackCarros.empty());
    }
}