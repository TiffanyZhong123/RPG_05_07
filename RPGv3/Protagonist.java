public abstract class Protagonist extends Character {
 
/**
 * Abstract-ify toString (without changing the class's header):
 * Protagonist.java:1: error: Protagonist is not abstract and does not override abstract method toString() in Protagonist
 * public class Protagonist extends Character {
 *        ^
 * 1 error
 *
 *
 * Instantiate a Protagonist:
 * ./Protagonist.java:46: error: Protagonist is abstract; cannot be instantiated
 *     Protagonist James = new Protagonist();
 *                         ^
 * 1 error
 *
 *
 * Omit concrete-ness (compile Warrior.java after removing Warrior.toString()):
 * Warrior.java:1: error: Warrior is not abstract and does not override abstract method toString() in Protagonist
 * public class Warrior extends Protagonist {
 *        ^
 * 1 error
**/

    public String name;

    public abstract String toString();

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
}
