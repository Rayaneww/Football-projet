public class Score {
    char etat; //'a' a venir 'c' en cours 't' terminé
    int butsEq1, butsEq2;

    public Score() {
        etat = 'a';
        butsEq1= 0;
        butsEq2= 0;
    }

    public char getStatut() {
        return etat;
    }
    public int getButsEquipe1() {
        return butsEq1;
    }
    public int getButsEquipe2() {
        return butsEq2;
    }
    public void butEquipe1() {
        if (etat=='c')butsEq1=butsEq1+ 1;
        else System.out.println("Le match n'est pas en cours");
    }
    public void butEquipe2() {
        if (etat=='c')butsEq2=butsEq2 + 1;
        else System.out.println("Le match n'est pas en cours");
    }
    public  String afficherbuts() {
        return butsEq1 +":"+butsEq2;
    }
    public void commencer() {
        etat = 'c';
    }
    public void termine() {
        etat = 't';
    }
}
