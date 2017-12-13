public class Warrior extends Protagonist {
    public Warrior( String n) {
	super( n, 100, 150, 60, 0.4);
    }

    public String toString() {
        return "The Warrior: " + super.toString();
    }
}
