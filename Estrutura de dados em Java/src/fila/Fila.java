package fila;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    // Enfileirar
    public void enqueue(T Object){
        No novoNo = new No(Object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if(!this.isEmpty()){
            No<T> primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();

                }else{
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }
    // Desenfileirar
    public T dequeue(){
        if(!isEmpty()){
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;

    }

    // Primeiro da fila

    // Checa se fila está vazia
    public  boolean isEmpty(){
        return refNoEntradaFila == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
               stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
               if(noAuxiliar.getRefNo() != null){
                   noAuxiliar = noAuxiliar.getRefNo();
               }else{
                   stringRetorno += "null";
                   break;
               }

            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
