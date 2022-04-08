package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controles.EditarDonoControle;
import data.Dados;

class Teste {

    @Test
    void testgetDonoObj() {
        Dados.adicionarDono();
        assertEquals(Dados.getDono().get(0), EditarDonoControle.getDonoObj(0));

    }

}
