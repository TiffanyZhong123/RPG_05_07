public class Protagonist extends Character {
    public String name;

    public Protagonist( String n) {
	name = n;
	HP = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
    }

    public String getName() {
	return name;
    }

    public void specialize() {
        defense -= 5;
	attackRating += 0.5;
    }

    public void normalize() {
	defense = 40;
	attackRating = 0.4;
    }
}
