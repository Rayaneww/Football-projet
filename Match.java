public class Match {

    public static void main(String[] args) {
        Score psg_om = new Score();
        System.out.println("Statut: "+psg_om.getStatut());
        System.out.println("PSG - OM \n"+psg_om.afficherbuts());
        psg_om.commencer();
        System.out.println("Statut: "+psg_om.getStatut());
        psg_om.butEquipe1();
        System.out.println("PSG - OM \n"+psg_om.afficherbuts());
        psg_om.termine();
        System.out.println("Statut: "+psg_om.getStatut());
        System.out.println("PSG - OM \n"+psg_om.afficherbuts());
        psg_om.butEquipe2();
        System.out.println("PSG - OM \n"+psg_om.afficherbuts());
        ///////////////////////////////////////////////////////////
        System.out.println("///////////////////////////////////\n Equipe Tableau");

        Equipe equipe1 = new Equipe("Paris saint germain","PSG");
        System.out.println(equipe1.toString());
        equipe1.arivee("Messi");
        equipe1.arivee("Ronaldo");
        equipe1.arivee("Kaka");
        equipe1.toLongString();
        equipe1.depart("Kaka");
        equipe1.toLongString();

        System.out.println("///////////////////////////////////\n Equipe Arraylist");
        ///////////////////////////////////////////////////////////

        EquipeArray equipe2 = new EquipeArray("Liverpool Football Club","LFC");
        System.out.println(equipe2.toString());
        equipe2.arivee("Zidane");
        equipe2.arivee("Saka");
        equipe2.arivee("Kane");
        equipe2.toLongString();
        equipe2.depart("Zidane");
        equipe2.toLongString();
    }

}
