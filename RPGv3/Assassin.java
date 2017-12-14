public class Assassin extends Protagonist {
    public Assassin( String n) {
	super( n, 175, 90, 40, 0.9);
    }

    public String toString() {
        return "The Assassin: " + name
	    + ", who has strength "
	    + strength + ", HP "
	    + HP + ", defense "
	    + defense + ", and an attackRating of "
	    + attackRating;
    }
    
    public void specialize() {
        defense -= 5;
	attackRating += 0.7;
    }

    public void normalize() {
	defense = 40;
	attackRating = 0.3;
    }
}
