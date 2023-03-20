import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PesquisaCrime {
    public static void main(String[] args) {

        List<String> perguntas = new ArrayList<>();

        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vitima?");
        perguntas.add("Devia para a vitima?");
        perguntas.add("Já trabalhou com a vítima");

        Scanner ler = new Scanner(System.in);

        int respostasPositivas = 0;
        String respostaEntrevistado;

        for (int i = 0; i < 5; i++){
            System.out.println(perguntas.get(i));
            respostaEntrevistado = ler.next();

            if(respostaEntrevistado.equalsIgnoreCase("s")) respostasPositivas++;

        }

        System.out.println("Respostas positivas: " + respostasPositivas);
        if ( respostasPositivas == 2 ) System.out.println("Suspeito");
        else if( respostasPositivas == 3 || respostasPositivas == 4) System.out.println("Cúmplice");
        else if ( respostasPositivas == 5) System.out.println("Assassina");
        else System.out.println("Inocente");


    }
}
