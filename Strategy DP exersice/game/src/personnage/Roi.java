package personnage;

import Strategies.ComportementArcFleche;
import Strategies.ComportementHache;

public class Roi extends Personnage {

    public Roi() {
        this.comportementArme = new ComportementHache();
    }

    @Override
    public void combattre() {
        score+=4;
        System.out.println("Je suis un Roi");
        this.comportementArme.utiliserArme();
        System.out.println("Score = "+score);

    }
}
