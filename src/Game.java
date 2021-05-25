import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }
    public double huidigeWaarde(){
    int huidigJaar = LocalDate.now().getYear();
    int jarenOud= huidigJaar - releaseJaar;
    double huidigeWaarde = nieuwprijs * (0.30*jarenOud);
    return huidigeWaarde;
    }
    public boolean equals(Object andereObject){

    return true;
    }

    @Override
    public String toString() {
        return "Game{" +
                "naam='" + naam + '\'' +
                ", releaseJaar=" + releaseJaar +
                ", nieuwprijs=" + nieuwprijs +
                '}';
    }
}
