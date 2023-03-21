package OrdenacaoSet;/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/


import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {



        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "ficção", 60));
            add(new Serie("Flash", "ficção", 60));
            add(new Serie("Sombras e ossos", "fantasia", 60));

        }};

        System.out.println("--\tOrdem aleatória\t--");
        for (Serie serie : minhasSeries) System.out.println(serie.getNome() +
                " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "medieval", 60));
            add(new Serie("dark", "suspense", 50));
            add(new Serie("Flash", "ficção", 60));
            add(new Serie("Sombras e ossos", "fantasia", 40));

        }};
        for (Serie serie : minhasSeries1) System.out.println(serie.getNome() +
                " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");

        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2) System.out.println(serie.getNome() +
                " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3) System.out.println(serie.getNome() +
                " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

    }

}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{


    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0 ) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}