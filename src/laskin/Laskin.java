package laskin;

import static java.lang.Math.sqrt;

public class Laskin {

    private static double tulos;  // Muuttuja tulokselle
    
    public void nollaa() {     // Nollaa tuloksen
        tulos = 0;
    }

    public double annaTulos() {
        return tulos;
    }
    
    public void lisaa(double n) {
        tulos = tulos + n;
    }

    public void vahenna(double n) {
        tulos = tulos - n;     // Bugi
    }

    public void kerro(double n) {
        tulos = tulos * n;
    }

    public void jaa(double n) {
        if (n == 0) {
            throw new ArithmeticException();
        }
        tulos = tulos / n;
    }

    public void nelio(double n) {
        tulos = n * n;
    }

    public void neliojuuri(double n) {
        if (n < 0.0) {
            throw new ArithmeticException();
        }
        tulos = sqrt(n);
    }
    
    public void virtaON() {
        System.out.println("Laskin on päällä.");
        tulos = 0;
    }

    public void virtaOFF() {
        System.out.println("Laskin sammuu.");
    }

}
