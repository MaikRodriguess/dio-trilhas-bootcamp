public class exercicioAula3 {
    public static void main(String[] args) {
        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();
    }


    // Imprime o nome do mês apartir do número correspondente ao mês
    private static void ifFlecha(){
        int mes = 0;

        if ( mes == 1 ){
            System.out.println("Janeiro");
        } else {
            if ( mes == 2 ){
                System.out.println("Fevereiro");
            } else {
                if ( mes == 3 ){
                    System.out.println("Março");
                } else {
                    if ( mes == 4 ) {
                        System.out.println("Abril");
                    } else {
                        if ( mes == 5 ) {
                            System.out.println("Maio");
                        } else {
                            if ( mes == 6 ) {
                                System.out.println("Junho");
                            } else {
                                if ( mes == 7 ) {
                                    System.out.println("Julho");
                                } else {
                                    System.out.println("Mês não encontrado");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // Imprime o nome do mês apartir do número correspondente ao mês
    private static void ifSemFlecha(){
        int mes = 12;
        if (mes == 1){
            System.out.println("Janeiro");
        } else if (mes == 2){
            System.out.println("Fevereiro");
        } else if (mes == 3){
            System.out.println("Março");
        } else if (mes == 4){
            System.out.println("Abril");
        } else if (mes == 5){
            System.out.println("Maio");
        } else if (mes == 6){
            System.out.println("Junho");
        } else if (mes == 7){
            System.out.println("Julho");
        } else if (mes == 8){
            System.out.println("Agosto");
        } else if (mes == 9){
            System.out.println("Setembro");
        } else if (mes == 10){
            System.out.println("Outubro");
        } else if (mes == 11){
            System.out.println("Novembro");
        } else if (mes == 12){
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês não encontrado");
        }
    }

//    Verifica se o mês é um periodo de férias
    private static void ifFerias(){
        String mes = "julho";
        if (mes == "janeiro" || mes == "julho" || mes == "dezembro"){
            System.out.println("Férias");
        }
    }

    // Verifica se um funcionario deve ou não receber auxilio com base em salário
    // e quantidade de filhos
    private static void ifMenor(){
        double salarioMensal = 10893.58d;
        double mediaSalarial = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        // Primeira forma de fazer
        if ((salarioMensal < mediaSalarial) && (quantidadeDependentes >= mediaDependentes)){
            System.out.println("Funcionário deve receber auxilio.");
        }

        // Segunda forma de fazer
        boolean salarioMensalBaixo = salarioMensal < mediaSalarial;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioMensalBaixo) && (muitosDependentes)){
            System.out.println("Funcionário deve receber auxilio.");
        }

        // Terceira forma de fazer
        boolean recebeAuxilio = salarioMensalBaixo && muitosDependentes;
        if (recebeAuxilio){
            System.out.println("Funcionário deve receber auxilio.");
        } else {
            System.out.println("Funcionário não deve receber auxilio");
        }

    }

    // Verifica dia da semana e imprime o número correspondente ao dia
    private static void switchSemana(){
        String dia = "Terça";
        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }

    // Verifica números: Certos, errados, talvez ou indefinidos
    private static void switchNumero(){

        int numero = 4;
        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido");
                break;

        }

    }

    // Verifica se o mês é um periodo de férias
    private static void switchFerias(){
        String mes = "dezembro";
        switch (mes){
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Ferias");
                break;
            default:
                System.out.println("Mês indefinido");
                break;
        }
    }



}
