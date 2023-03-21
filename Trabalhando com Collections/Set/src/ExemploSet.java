import com.sun.jdi.connect.spi.TransportService;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie um conjunto e adicione as notas: ");

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); //Generics(jdk 5) - Diamond Operator(jdk 7)

        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: "+ Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();

        double soma = 0.0;
        while (iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
//
        System.out.println("Exiba a média das notas: " + soma / notas.size());
////
        System.out.println("Remova a nota 0: " );
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: " );
        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove(); // Se o elemento for menor que 7, remove
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();
        System.out.println("Confira se o conjunto está vazia: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazia: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazia: " + notas3.isEmpty());

    }

}
