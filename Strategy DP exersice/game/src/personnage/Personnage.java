package personnage;

import Strategies.ComportementArme;

public abstract class Personnage {
    protected String name;
    protected int score;

    protected ComportementArme comportementArme;

    public void setComportementArme(ComportementArme comportementArme) {
        this.comportementArme = comportementArme;
    }

    public abstract void combattre();
}
