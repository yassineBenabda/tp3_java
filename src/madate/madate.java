package madate;


public class madate {
    private int jour;
    private int mois;
    private int annee;


    public madate(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }


    public madate(int annee) {
        this.jour = 1;
        this.mois = 1;
        this.annee = annee;
    }


    public int getjour() {
        return jour;
    }

    public void setjour(int jour) {
        this.jour = jour;
    }


    public int getmois() {
        return mois;
    }

    public void setmois(int mois) {
        this.mois = mois;
    }


    public int getannee() {
        return annee;
    }

    public void setannee(int annee) {
        this.annee = annee;
    }


    public String toString() {
        return jour + "/" + mois + "/" + annee;
    }


    public void ajouterunjour() {
        jour++;
        if (jour > joursdansmois(mois, annee)) {
            jour = 1;
            ajouterunmoi();
        }
    }


    public void ajouterPlusieursJours(int n) {
        for (int i = 0; i < n; i++) {
            ajouterunjour();
        }
    }


    public void ajouterunmoi() {
        mois++;
        if (mois > 12) {
            mois = 1;
            ajouterunan();
        }
    }


    public void ajouterunan() {
        annee++;
    }


    private int joursdansmois(int mois, int annee) {
        switch (mois) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (estbissextile(annee)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }


    private boolean estbissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
    }
}
