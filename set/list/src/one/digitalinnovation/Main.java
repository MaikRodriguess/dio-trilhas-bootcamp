package one.digitalinnovation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Carro> hashSetcarros = new HashSet<>();

        hashSetcarros.add(new Carro("Ford"));
        hashSetcarros.add(new Carro("chevrolet"));
        hashSetcarros.add(new Carro("Peugout"));
        hashSetcarros.add(new Carro("zip"));
        hashSetcarros.add(new Carro("Fiat"));
        hashSetcarros.add(new Carro("Alfa Romeu"));

        System.out.println(hashSetcarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("chevrolet"));
        treeSetCarros.add(new Carro("Peugout"));
        treeSetCarros.add(new Carro("zip"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Alfa Romeu"));

        System.out.println(treeSetCarros);

    }

}