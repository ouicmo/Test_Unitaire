public class Horaire {
    private int chHeure;
    private int chQuartHeure;

    public Horaire(int parHeure, int parQuartHeure) {
        chHeure = parHeure;
        chQuartHeure = parQuartHeure;
    }

    public boolean estValide(){
        return (chHeure >= 0 && chQuartHeure >= 0 && chHeure < 24 && chQuartHeure < 59);
    }

    public int toMinute(){
        return chHeure * 60 + chQuartHeure;
    }

    public int getHeure() {
        return chHeure;
    }

    public int getQuartHeure() {
        return chQuartHeure;
    }

    public void setHeure(int parHeure) {
        chHeure = parHeure;
    }

    public void setQuartHeure(int parQuartHeure) {
        chQuartHeure = parQuartHeure;
    }

    public String toString(){
        return chHeure + "h" + chQuartHeure;
    }
}
