package personnage;

import Strategies.ComportementArcFleche;

public class Reine extends Personnage {
    public Reine() {
        this.comportementArme = new ComportementArcFleche();
    }

    @Override
    public void combattre() {
        score+= 2;
        System.out.println("Je suis une Reine");
        this.comportementArme.utiliserArme();
        System.out.println("Score = "+score);
    }
}
