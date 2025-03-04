public class Equipe {
    String nom,sigle;
    String[] joueurs;
    public Equipe(String n,String s) {
        nom=n;
        sigle = s;
        joueurs = new String[0];
    }
    public void arivee(String j) {
        String[] copie = new String[joueurs.length+1];
        for(int i =0;i<joueurs.length;i++) {
            copie[i]=joueurs[i];
        }
        copie[joueurs.length]=j;
        joueurs=copie;
    }
    public void depart(String j) {
        String[] copie = new String[joueurs.length-1];
        int idx =0;
        for(int i =0;i<joueurs.length;i++) {
            if(!joueurs[i].equals(j)) {
                copie[idx]=joueurs[i];
                idx=+1;
            }
        }
        joueurs=copie;
        System.out.println(j+" est parti du club !");
    }
    public String toString() {
        return nom +"("+sigle+")";
    }
    public void toLongString() {
        System.out.println("+---------+\n"+String.format("| %-7s |",sigle)+"\n+---------+");

        for(int i =0;i<joueurs.length;i++) {
            String j = joueurs[i];
	    String joueurFormate = String.format("| %-7s |", j);
	    System.out.println(joueurFormate);
        }
        System.out.println("+---------+");
    }
}
