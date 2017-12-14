public class Warrior extends Protagonist {
    public Warrior( String n) {
	super( n, 100, 80, 60, 0.4);
    }

    public void specialize() {
        defense -= 5;
	attackRating += 0.5;
    }

    public void normalize() {
	defense = 40;
	attackRating = 0.4;
    }

    public String toString() {
        return "The Warrior: " + name
	    + ", who has strength "
	    + strength + ", HP "
	    + HP + ", defense "
	    + defense + ", and an attackRating of "
	    + attackRating;
    }
}
