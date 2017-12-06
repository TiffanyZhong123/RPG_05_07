public class Protagonist extends Character {
    public String name;

    public String toString(){
        return name + ", who has strength " 
             + strength + ", HP "
             + HP + ", defense " 
             + defense + ", and an attackRating of " 
             + attackRating;
    }

    public Protagonist( String n, int a, int b, int c, double d) {
	name = n;
	HP = a;
	strength = b;
	defense = c;
	attackRating = d;
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
