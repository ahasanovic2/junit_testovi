package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RazlomakTest {

    @Test
    void skrati() {
        Razlomak r = new Razlomak (15,6);
        r.skrati();
        assertEquals(5,r.getBrojnik());
    }

    @Test
    void skrativ() {
        Razlomak r = new Razlomak (15,6);
        assertTrue(r.skrativ());
    }

    @Test
    void dajDouble() {
        Razlomak r = new Razlomak(15,6);
        assertEquals(2.5,r.dajDouble());
    }

    @Test
    void testKonstruktora () {
        Razlomak r = new Razlomak (15,6);
        assertEquals("15/6",r.toString());
    }

    @Test
    void setNazivnik() {
        Razlomak r = new Razlomak (15,6);
        r.setNazivnik(10);
        assertEquals(10,r.getNazivnik());
    }
    @Test
    void setNeispravanNazivnik() {
        Razlomak r = new Razlomak (15,6);
        assertThrows(IllegalArgumentException.class,() -> r.setNazivnik(0), "Nije moguće dijeliti sa nulom");
    }
}