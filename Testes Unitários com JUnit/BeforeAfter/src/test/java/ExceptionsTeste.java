import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste{

    @Test
    void validaCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta(12,25d);
        Conta contaDestino = new Conta(32, 0);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1d));
    }

}
