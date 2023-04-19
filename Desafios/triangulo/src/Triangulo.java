// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  


import java.io.IOException;
import java.util.Scanner;

public class Triangulo{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double area;
        double perimetro;

        Triangulo trianguloClass = new Triangulo();

            // Caso forme um triangulo
        if(A+B > C && A+C > B &&  B+C > A){
            perimetro = trianguloClass.perimetro(A, B, C);
            System.out.printf("Perimetro = %.2f", perimetro);

            // Caso não forme um triangulo
        }else {
            area = trianguloClass.area(A, B, C);
            System.out.printf("Area = %.2f", area);
        }
    }

    // AREA
    public double area(double A, double B, double C){
        return ((A + B) * C) / 2;
    }

    //PERIMETRO
    public double perimetro(double A, double B, double C){
        return A + B + C;
    }
}
