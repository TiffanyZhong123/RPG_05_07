public class Necromancer extends Monster {
    public Necromancer() {
	super( 100, (int) Math.random() * 75 + 10, 50, 0.7);
    }

    public String toString() {
        return "A Necromancer " + super.toString();
    }
}
