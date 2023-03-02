public class Operadores {
    public static void main(String[] args) {

        // classe Operadores.java
        int a, b;

        a = 6;
        b = 6;

        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
       /* String resultado = "";
        if(a==b)
           resultado = "verdadeiro";
        else
           resultado = "falso";*/



        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);
    }
}