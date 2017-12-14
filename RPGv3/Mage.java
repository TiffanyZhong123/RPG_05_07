public class Mage extends Protagonist {
    public Mage( String n) {
	super( n, 150, 70, 80, 0.6);
    }
    public void specialize() {
        defense -= 5;
	attackRating += 0.8;
    }

    public void normalize() {
	defense = 50;
	attackRating = 0.3;
    }

    public String toString() {
        return "The Mage: " + name
	    + ", who has strength "
	    + strength + ", HP "
	    + HP + ", defense "
	    + defense + ", and an attackRating of "
	    + attackRating;
    }
}
