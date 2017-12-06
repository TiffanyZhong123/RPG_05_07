public class Monster extends Character {
    public Monster( int a, int b, int c, double d) {
	HP = a;
	strength = b;
	defense = c;
	attackRating = d;
    }

    public String toString(){
        return "has strength " 
             + strength + ", HP "
             + HP + ", defense " 
             + defense + ", and an attackRating of " 
             + attackRating;
    }
}
