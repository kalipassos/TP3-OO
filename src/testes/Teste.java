package testes;

import static org.junit.jupiter.api.Assertions.*;

import controles.EditarAnfitriaoControle;
import controles.EditarDonoControle;
import data.Dados;

class Teste {

    @Test
    void testgetDonoObj() {
        Dados.adicionarDono();
        assertEquals(Dados.getDono().get(0), EditarDonoControle.getDonoObj(0));

    }

    @Test
    void testgetAnfitriaoObj() {
        Dados.adicionarDono();
        assertEquals(Dados.getAnfitriao().get(0), EditarAnfitriaoControle.getAnfitriaoObj(0));
   
        }


    @Test
    void 
       
        

    }
