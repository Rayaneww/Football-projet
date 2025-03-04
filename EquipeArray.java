import java.util.ArrayList;

public class EquipeArray {
    String nom,sigle;
    ArrayList<String> joueurs;

    public EquipeArray(String n,String s) {
        nom=n;
        sigle = s;
        joueurs = new ArrayList<String>();
    }
    public void arivee(String j) {
        joueurs.add(j);
    }
    public void depart(String j) {
        joueurs.remove(j);
        System.out.println(j+" est parti du club !");
    }
    public String toString() {
        return nom +"("+sigle+")";
    }
    public void toLongString() {
        System.out.println("+---------+\n"+String.format("| %-7s |",sigle)+"\n+---------+");

        for(int i =0;i<joueurs.size();i++) {
	    String j = joueurs.get(i);
	    String joueurFormate = String.format("| %-7s |", j);
	    System.out.println(joueurFormate);
        }
        System.out.println("+---------+");
    }
}
