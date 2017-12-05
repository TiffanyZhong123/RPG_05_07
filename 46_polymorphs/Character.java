public class Character {
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attackRating;

    public boolean isAlive() {
	if (HP <= 0) {
	    return false;
	} else {
	    return true;
	}
    }
    
    protected int getDefense() {
        return defense;
    }

    protected void lowerHP( int hit) {
	HP = HP - hit;
    }

    public int attack( Character c) {
	int damage = 0;
	damage = (int) (strength * attackRating) - c.defense;
	c.lowerHP(damage);
	return damage;
    }
}
