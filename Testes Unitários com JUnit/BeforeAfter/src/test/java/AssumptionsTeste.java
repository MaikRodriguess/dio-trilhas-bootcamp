import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class AssumptionsTeste {

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.LINUX})
    void validarOS(){
        // Valida se o sistema for Windows ou linux
        System.out.println("Sistema aceito!");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void validarJRE(){
        // Valida se a versão do JRE for igual a 17
        System.out.println("Versão validada!");
    }

}
