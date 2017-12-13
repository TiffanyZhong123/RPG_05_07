public class Assassin extends Protagonist {
    public Assassin( String n) {
	super( n, 175, 110, 40, 0.9);
    }

    public String toString() {
        return "The Assassin: " + super.toString();
    }
}
