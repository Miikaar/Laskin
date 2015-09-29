package laskin;



import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;
import laskin.Laskin;

// Käyttää Parameterized ajuria
// Testitapaukset ja odotetut tulokset Collection-oliossa
@RunWith(Parameterized.class)
public class NelioTest {

    private static Laskin laskin = new Laskin();
    private double luku;
    private double tulos;

    @Parameters
    public static List testiTapaukset() {
        return Arrays.asList(new Object[][]{
                    {0, 0},
                    {1.0, 1.0},
                    {2.0, 4.0},
                    {4.0, 16.0},
                    {5.0, 25.0},
                    {6.0, 36.0},
                    {7.0, 49.0} // 7*7 = 49, ei 48
                });
    }

    // Konstruktori, jota JUnit kutsuu kullekin listan testitapaukselle.
    // Parametrien kytkentä sijainnin / järjestyksen perusteella:
    // ekana syötetty luku, toisena odotettu arvo
    public NelioTest(double luku, double tulos) {
        this.luku = luku;
        this.tulos = tulos;
    }

    @Test
    public void testNelio() {
        String messu = luku + " * " + luku;
        laskin.nelio(luku);
        assertEquals(messu, tulos, laskin.annaTulos(), 0);
    }
}
