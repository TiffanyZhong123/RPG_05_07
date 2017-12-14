public class Assassin extends Protagonist {
    public Assassin( String n) {
	super( n, 175, 110, 40, 0.9);
    }
    public void specialize() {
        defense -= 5;
	attackRating += 0.7;
    }

    public void normalize() {
	defense = 40;
	attackRating = 0.3;
    }

    public String toString() {
        return "The Assassin: " + super.toString();
    }
}
