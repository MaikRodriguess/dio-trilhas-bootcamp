public class TransferenciaEntreContas {
    void transfere(Conta destino,Conta Origem,  Double valor){
        if(valor <= 0) throw new IllegalArgumentException("Valor deve ser maior que zero!");
    }

}
