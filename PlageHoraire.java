import java.util.Arrays;

public class PlageHoraire implements Comparable<PlageHoraire>{
    private final static int chDureeMini = 15;
    private Horaire chHoraireDebut;
    private Horaire chHoraireFin;





    public PlageHoraire(Horaire parHoraireDebut, Horaire parHoraireFin) throws ExceptionPlanning {

        chHoraireDebut = parHoraireDebut;
        chHoraireFin = parHoraireFin;

        if(!parHoraireDebut.estValide() || !parHoraireFin.estValide()){
            throw new ExceptionPlanning(0);
        }



    }

    public String toString() {
        return chHoraireDebut + " - " + chHoraireFin + " ,durée : " + duree() + " minutes";
    }

    public boolean estValide() {
        if (chHoraireFin.toMinute() - chHoraireDebut.toMinute() > chDureeMini)
            return true;

        return false;
    }

    public Horaire duree(){
        int duree = chHoraireFin.toMinute() - chHoraireDebut.toMinute();
        int heure = duree / 60;
        int minutes = duree % 60;

        return new Horaire(heure, minutes);
    }

    public int compareTo(PlageHoraire parPlageHoraire) {
        if( this.chHoraireFin.toMinute() < parPlageHoraire.chHoraireDebut.toMinute()){
            return -1;
        } else if ( this.chHoraireDebut.toMinute() > parPlageHoraire.chHoraireFin.toMinute()) {
            return 1;
        }
        else {
            return 0;
        }
    }



}
