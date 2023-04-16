package desafio.animal;

import java.io.IOException;
import java.util.Scanner;

public class Animal {

    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        String AN1,AN2,AN3;



        //TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
        //Dica: Você pode utilizar o método equals para realizar comparações.

        while (true){
            AN1 = sc.nextLine();
            AN2 = sc.nextLine();
            AN3 = sc.nextLine();

            // VERTEBRADO
            if(AN1.equalsIgnoreCase("vertebrado")){

                  // AVE
                if(AN2.equalsIgnoreCase("ave")){
                    if(AN3.equalsIgnoreCase("carnivoro")){
                        System.out.println("aguia");
                        break;
                    } else if (AN3.equalsIgnoreCase("onivoro")) {
                        System.out.println("pomba");
                        break;
                    }else {
                        System.out.println("Não identificado.. tente novamente");
                        continue;
                    }

                    // MAMIFERO
                } else if (AN2.equalsIgnoreCase("mamifero")) {
                    if(AN3.equalsIgnoreCase("onivoro")){
                        System.out.println("homem");
                        break;
                    } else if (AN3.equalsIgnoreCase("herbivoro")) {
                        System.out.println("vaca");
                        break;
                    }else {
                        System.out.println("Não identificado.. tente novamente");
                        continue;
                    }
                }

                // INVERTEBRADO
            } else if (AN1.equalsIgnoreCase("invertebrado")) {
                 // INSETOS
                if(AN2.equalsIgnoreCase("inseto")){
                    if(AN3.equalsIgnoreCase("hematofago")){
                        System.out.println("pulga");
                        break;
                    } else if (AN3.equalsIgnoreCase("herbivoro")) {
                        System.out.println("lagarta");
                        break;
                    }else {
                        System.out.println("Não identificado.. tente novamente");
                        continue;
                    }

                    // ANELIDEOS
                } else if (AN2.equalsIgnoreCase("anelideo")) {
                    if(AN3.equalsIgnoreCase("hematofago")){
                        System.out.println("sanguessuga");
                        break;
                    } else if (AN3.equalsIgnoreCase("onivoro")) {
                        System.out.println("minhoca");
                        break;
                    }else {
                        System.out.println("Não identificado.. tente novamente");
                        continue;
                    }
                }else{
                    System.out.println("Não identificado.. tente novamente");
                    continue;
            }   }


        }


    }
}
