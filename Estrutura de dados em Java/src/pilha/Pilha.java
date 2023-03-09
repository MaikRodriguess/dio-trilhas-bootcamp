package pilha;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setrefNo(refAuxiliar);
    }

    public No pop(){
        if(!isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getrefNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
       return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "-------------------------\n";

        stringRetorno += "     Pilha\n";
        stringRetorno += "-------------------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar != null){
            stringRetorno += "[No{dado=" +noAuxiliar.getDado() + "}]\n";
            noAuxiliar = noAuxiliar.getrefNo();
            }else {
                break;
            }
        }

        return stringRetorno;
    }
}
