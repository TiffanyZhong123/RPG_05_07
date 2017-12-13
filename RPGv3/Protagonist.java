public abstract class Protagonist extends Character {
 
/***************************
 * error from compiling Protagoinst w abstract methods without declaring it abstract:
 *Protagonist.java:1: error: Protagonist is not abstract and does not override abstract method normalize() in Protagonist
 *public  class Protagonist extends Character {
 *        ^
 *1 error

 * error from compiling warrior with no override:
 *Warrior.java:1: error: Warrior is not abstract and does not override abstract method normalize() in Protagonist
 *public class Warrior extends Protagonist {
 *       ^
 *1 error
 *[1]+  Done                    gedit Warrior.java

 *trying to instantiate Protagonist:
 *./Protagonist.java:46: error: Protagonist is abstract; cannot be instantiated
 *    Protagonist James = new Protagonist();
 *                        ^
 *1 error


 **/
    public String name;

    public abstract String toString();
/**
    public String toString(){
        return name + ", who has strength " 
             + strength + ", HP "
             + HP + ", defense " 
             + defense + ", and an attackRating of " 
             + attackRating;
    }
*/

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

    public abstract void specialize();

    public abstract void normalize();
  

/**
    public void specialize() {
        defense -= 5;
	attackRating += 0.5;
    }

    public void normalize() {
	defense = 40;
	attackRating = 0.4;
}
*/   
 
}
