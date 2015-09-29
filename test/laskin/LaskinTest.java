package laskin;



import laskin.Laskin;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

// Luokan nimen loppu pitää olla Test
public class LaskinTest {

    // Fixture ("vakiokaluste"): kaikki testit käyttävät samaa laskinta,
    // joka nollataan ennen kutakin testiä.
    private static Laskin laskin = new Laskin();

    @Before
    public void clearCalculator() {
        laskin.nollaa();
    }

    // Testimetodin nimi voi olla mitä tahansa, edessä annotaatio @Test    
    @Test
    public void testLisaa() {
        laskin.lisaa(1.0);
        laskin.lisaa(1.0);
        assertEquals("1 + 1 ", 2.0, laskin.annaTulos(), 0.0);
    }

    @Test
    public void testVahenna() {
        laskin.lisaa(10.0);
        laskin.vahenna(2.0);
        assertEquals("10 - 2 ", 8.0, laskin.annaTulos(), 0.0);
    }

    @Test
    public void testJaa() {
        laskin.lisaa(8.0);
        laskin.jaa(2.0);
        assertEquals("8 / 2 ", 4.0, laskin.annaTulos(), 0.0);
    }

    // Nollalla jaon pitäisi heittää poikkeus
    @Test(expected = ArithmeticException.class)
    public void testJaaNollalla() {
        laskin.jaa(0);
    }

    // Tätä testiä ei haluta vielä ajaa
    @Test
    //@Ignore("Metodi multiply() on vielä toteuttamatta.")
    public void testKerro() {
        laskin.lisaa(10.0);
        laskin.kerro(10.0);
        assertEquals("10 * 10 ", 100.0, laskin.annaTulos(), 0.0);
    }
}
