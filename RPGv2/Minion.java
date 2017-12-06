public class Minion extends Monster {
    public Minion() {
	super( 75, (int) Math.random() * 50 + 5, 30, 0.5);
    }

    public String toString() {
        return "A Minion " + super.toString();
    }
}
