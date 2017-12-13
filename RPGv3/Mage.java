public class Mage extends Protagonist {
    public Mage( String n) {
	super( n, 150, 120, 80, 0.6);
    }

    public String toString() {
        return "The Mage: " + super.toString();
    }
}
