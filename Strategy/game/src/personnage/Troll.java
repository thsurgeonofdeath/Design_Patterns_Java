package personnage;

import Strategies.ComportementArcFleche;
import Strategies.ComportementPoignard;

public class Troll extends Personnage {
    public Troll() {
        this.comportementArme = new ComportementPoignard();
    }

    @Override
    public void combattre() {
        score+= 1;
        System.out.println("Je suis un troll");
        this.comportementArme.utiliserArme();
        System.out.println("Score = "+score);
    }
}
