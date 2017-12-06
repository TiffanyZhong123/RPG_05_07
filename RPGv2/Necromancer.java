public class Necromancer extends Monster {
    public Necromancer() {
	super( 100, (int) Math.random() * 75 + 20, 50, 0.7);
    }

    public String toString() {
        return "A Necromancer " + super.toString();
    }
}
