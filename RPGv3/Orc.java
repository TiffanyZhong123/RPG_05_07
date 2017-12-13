public class Orc extends Monster {
    public Orc() {
	super( 200, (int) Math.random() * 90 + 20, 70, 0.4);
    }

    public String toString() {
        return "An Orc " + super.toString();
    }
}
