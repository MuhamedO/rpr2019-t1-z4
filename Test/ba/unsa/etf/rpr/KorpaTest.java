package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    @Test
    void daLiSeIspravnoDodajeArtikl(){
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("naziv", 25, "kod"));
        Artikl[] artikli = korpa.getArtikli();
        assertAll(()->{
            assertNotNull(artikli[0]);
            assertEquals("naziv", artikli[0].getNaziv());
        });
    }
    @Test
    void daLiCePrekoracitiBrojArtikala(){
        assertDoesNotThrow(()->{
            Korpa korpa = new Korpa();
            for(int i=0; i<2000; i++){
                korpa.dodajArtikl(new Artikl("naziv"+i, i, "kod"+i));
            }
        });
    }

}