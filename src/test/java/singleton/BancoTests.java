package test.java.singleton;

import main.java.singleton.Banco;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BancoTests {

    @Test
    public void deveRetornarEndpoint(){
        Banco.getInstance().setEndpoint("prod");
        assertEquals("prod",Banco.getInstance().getEndpoint());

    }

    @Test
    public void deveRetornarSenha(){
        Banco.getInstance().setSenha("123");
        assertEquals("123", Banco.getInstance().getSenha());
    }

}
