public class Minion extends Monster {
    public Minion() {
	super( 140, (int) Math.random() * 30 + 5, 30, 0.5);
    }

    public String toString() {
        return "A Minion " + super.toString();
    }
}
