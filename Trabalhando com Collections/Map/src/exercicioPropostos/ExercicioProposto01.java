package exercicioPropostos;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

import java.util.*;

public class ExercicioProposto01 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");

        Map<String, Integer> populacaoEstadoNE = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstadoNE);

//        for ( Map.Entry<String, Integer> populacaoCidade: populacaoEstadoNE.entrySet()) {
//            System.out.println(populacaoCidade.getKey() + " - " + populacaoCidade.getValue());
//        }
        System.out.println("Substitua a população do estado RN por : 3.534.165");
        populacaoEstadoNE.put("RN", 3534165);
        System.out.println(populacaoEstadoNE);

        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " + "PB - 4.039.277:");
        System.out.println(populacaoEstadoNE.containsKey("PB"));
        populacaoEstadoNE.put("PB", 4039277);


        System.out.println("Exiba a população do estado PE: " + populacaoEstadoNE.get("PE"));

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populacaoEstadoNE1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populacaoEstadoNE1);

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacaoEstadoNE2 = new TreeMap<>(populacaoEstadoNE1);
        System.out.println(populacaoEstadoNE2);


        Collection<Integer> populacao = populacaoEstadoNE.values();
        String estadoMenorPopulacao = "";
        String estadoMaiorPopulacao = "";

        for (Map.Entry<String, Integer> populacaoEstado:populacaoEstadoNE.entrySet()) {
            if(populacaoEstado.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = populacaoEstado.getKey();
            if(populacaoEstado.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = populacaoEstado.getKey();
        }
        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
            estadoMenorPopulacao, Collections.min(populacao));

        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
            estadoMaiorPopulacao, Collections.max(populacao));



        System.out.println("Exiba a soma da população desses estados: ");
       int soma = 0;
       for(Map.Entry<String, Integer> entry : populacaoEstadoNE.entrySet()) {
           soma += entry.getValue();
       }
        System.out.println(soma);


        System.out.println("Exiba a média da população deste dicionário de estados: " );
        int media = soma / populacaoEstadoNE.size();
        System.out.println(media);

        System.out.println("Remova os estados com a população menor que 4.000.000: ");

        Iterator<Integer> iterator = populacaoEstadoNE.values().iterator();

        while (iterator.hasNext()){
            if( iterator.next() <= 4000000) iterator.remove();
        }
        System.out.println(populacaoEstadoNE);



        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        populacaoEstadoNE.clear();
        System.out.println(populacaoEstadoNE);

        System.out.println("Confira se a lista está vazia: ");
        System.out.println(populacaoEstadoNE.isEmpty());

    }

}

