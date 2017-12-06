public class Monster extends Character {
    public Monster() {
	HP = 150;
	strength = (int) Math.random() * 45 + 20;
	defense = 20;
	attackRating = 0.4;
    }

    public String toString(){
        return "Has strength " 
             + strength + ", HP "
             + HP + ", defense " 
             + defense + ", and an attackRating of " 
             + attackRating;
    }
}
