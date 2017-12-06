/**********************************************
 * class YoRPG -- Driver file for Ye Olde Role Playing Game.
 * Simulates monster encounters of a wandering adventurer.
 * Required classes: Protagonist, Monster
 **********************************************/

// shorthand, used to read from CLI
import java.io.*;   
import java.util.*;

public class YoRPG
{
  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

  //change this constant to set number of encounters in a game
  public final static int MAX_ENCOUNTERS = 5;

  //each round, a Protagonist and a Monster will be instantiated...
  private Protagonist pat;   //Is it man or woman?
  private Monster smaug; //Friendly generic monster name?

  private int moveCount;
  private boolean gameOver;
  private int difficulty;

  private InputStreamReader isr;
  private BufferedReader in;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
  public YoRPG()
  {
    moveCount = 0;
    gameOver = false;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
  }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

  /*=============================================
    void newGame() -- gathers info to begin a new game
    precondition:  
    post: according to user input, modifies instance var for difficulty 
    and instantiates a Protagonist
    =============================================*/
  public void newGame()
  {
    int i = 1;
    String s;
    String name = "";
    s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

    s += "\nChoose your difficulty: \n";
    s += "\t1: Easy\n";
    s += "\t2: Not so easy\n";
    s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
    s += "Selection: ";
    System.out.print( s );

    try {
	    difficulty = Integer.parseInt( in.readLine() );
    } catch ( IOException e ) { }

    try {
	System.out.println( "\nIntrepid protagonist, what art thou? (Choose avatar): " );
	System.out.println( "\t1: A brute Warrior?\n\t2: An all-powerful Mage?\n\t3: Or a mysterious Assassin?" );
	i = Integer.parseInt( in.readLine() );
    }
    catch ( IOException e ) { }
    
    s = "What doth thy call thyself? (State your name): ";
    System.out.print( s );

    try {
	    name = in.readLine();
    } catch ( IOException e ) { }

    //instantiate the player's character
    if ( i == 2 )
	pat = new Assassin( name );
    else if ( i == 3 )
	pat = new Mage( name );
    else
	pat = new Warrior( name );

  }//end newGame()


  /*=============================================
    boolean playTurn -- simulates a round of combat
    pre:  Protagonist pat has been initialized
    @return the boolean value of
        "the player survives"
    =============================================*/
  public boolean playTurn()
  {
    int i = 1;
    int d1, d2;
    double r = Math.random() * 3.0;

    if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
    else {
	if ( r <= 1.3 ) {
	    smaug = new Minion();
	    System.out.println( "\nLo, yonder Minion approacheth!" );
	} else if ( r <= 2.3 ) {
	    smaug = new Necromancer();
	    System.out.println( "\nLo, yonder Necromancer approacheth!" );
	} else {
	    smaug = new Orc();
	    System.out.println( "\nLo, yonder Orc approacheth!" );
	}

	    while( smaug.isAlive() && pat.isAlive() ) {

        // Give user the option of using a special attack:
        // If you land a hit, you incur greater damage,
        // ...but if you get hit, you take more damage.
        try {
          System.out.println( "\nDo you feel lucky?" );
          System.out.println( "\t1: Nay.\n\t2: Aye!" );
          i = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e ) { }

        if ( i == 2 )
          pat.specialize();
        else
          pat.normalize();

        d1 = pat.attack( smaug );
        d2 = smaug.attack( pat );

        System.out.println( "\n" + pat.getName() + " dealt " + d1 +
                            " points of damage.");

        System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
                            " for " + d2 + " points of damage.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
        System.out.println( "'Twas an epic battle, to be sure... " + 
                            "You cut ye olde monster down, but " +
                            "with its dying breath ye olde monster. " +
                            "laid a fatal blow upon thy skull." );
        return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
        System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
        return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
        System.out.println( "Ye olde self hath expired. You got dead." );
        return false;
	    }
    }//end else

    return true;
  }//end playTurn()
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main( String[] args )
  {
    // As usual, uncomment progressively in tiny steps

    // //loading...
    YoRPG game = new YoRPG();

    int encounters = 0;

    while( encounters < MAX_ENCOUNTERS ) {
        if ( !game.playTurn() )
            break;
        encounters++;
        System.out.println();
    }

    System.out.println( "Thy game doth be over." );
  }//end main

}//end class YoRPG
