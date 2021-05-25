public class Persoon {
    private String naam;
    private double budget;

    public Persoon(String nm, double bud){
        this.naam = nm;
        this.budget = bud;
    }

    public double getBudget() {
        return budget;
    }
    public boolean koop(Game g){
    double waarde = g.huidigeWaarde();
    if (waarde>getBudget()) {
        return false;
    }else{
        return true;
    }

    }
    public boolean verkoop(Game g, Persoon koper){
        boolean verkocht= true;
//        if()
    return verkocht;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                ", budget=" + budget +
                '}';
    }
}
