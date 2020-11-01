package ba.unsa.etf.rpr;

public class Razlomak {
    private int brojnik, nazivnik;
    Razlomak () { this(1,1); }
    Razlomak (int brojnik, int nazivnik) throws IllegalArgumentException {
        if (nazivnik==0) throw new IllegalArgumentException("Nije moguće dijeliti sa nulom");
        this.brojnik=brojnik;
        this.nazivnik=nazivnik;
    }
    private int gcd (int a, int b)
    {
        if (b>a) return gcd(b,a);
        if (b==0) return a;
        return gcd (b, a%b);
    }
    public void skrati () {
        int gcd = gcd(Math.abs(brojnik), Math.abs(nazivnik));
        if (gcd > 1) {
            brojnik /= gcd;
            nazivnik /= gcd;
        }
    }
    public boolean skrativ () {
        int gcd = gcd(Math.abs(brojnik), Math.abs(nazivnik));
        return gcd > 1;
    }

    public int getBrojnik() {
        return brojnik;
    }

    public void setBrojnik(int brojnik) {
        this.brojnik = brojnik;
    }

    public int getNazivnik() {
        return nazivnik;
    }

    public void setNazivnik(int nazivnik) throws IllegalArgumentException {
        if (nazivnik==0) throw new IllegalArgumentException("Nije moguće dijeliti sa nulom");
        this.nazivnik = nazivnik;
    }
    public double dajDouble() {
        return (double) brojnik/nazivnik;
    }

    @Override
    public String toString() {
        return String.valueOf(brojnik) + "/" + String.valueOf(nazivnik);
    }

}
