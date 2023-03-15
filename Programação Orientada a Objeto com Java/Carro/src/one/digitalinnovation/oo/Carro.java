package one.digitalinnovation.oo;/* Exercicio 3:
 Evolua o conceito do exercício 2 e defina 1 método para calcular o valor total para encher o tanque. Este deve receber como parâmetro o valor da gasolina. Faça também duas sobrecargas do construtor.
Obs: use a linguagem que gostar e siga as dicas sobre como criar métodos
Obs: Crie métodos específicos para fornecer e obter os valores dos atributos(set/get), caso aplicável.*/

/* Exercicio 4:
Evolua o conceito do exercício 3 criando objetos da classe "one.digitalinnovation.oo.Carro".
Use os métodos set/get, quando aplicáveis, para definir os valores dos atributos e exibir estes valores "get".
Passe também uma mensagem para o cálculo do total pra encher o tanque.
Obs: use a linguagem que gostar e siga as dicas sobre como criar métodos, atributos, etc.
Obs: use System.out, Console.WriteLine ou print*/
public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    public Carro() {}

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
