//Team name: XYZ (Melanie Chow, Eric Li, Iris Tao)
//APCS1 Period 4
//HW #34: Ye Olde Role Playing Game, Unchained
//2016-11-23

/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Warrior and a Monster will be instantiated...
    private Character pat;   //Is it man or woman?
    private Character smaug; //Friendly generic monster name?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;
    private int role; //parse this in terminal
    private String chr; //string to type cast it

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
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Warrior
      =============================================*/
    public void newGame()
    {
	String s;
	String name = "";
	s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

	s += "\nChoose your difficulty: \n" ;
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	s = "What doth thy call thyself? (State your name) ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }
	//instantiate the player's character
	String x="";
        x= "What path doth you take? \n";
	x += "\t1: Warrior\n";
	x += "\t2: Mage\n";
	x += "\t3: Rogue\n";
	x += "Selection: ";
	System.out.print(x);
	try {
	    role=Integer.parseInt(in.readLine());
	    if (role==1){
		pat= new Warrior (name);
		System.out.println(pat.about());
	    }
	    else if (role==2){
		pat=new Mage (name);
		System.out.println(pat.about());
	    }
	    else if (role==3){
		pat= new Rogue (name);
		System.out.println(pat.about());
	    }
	}
	catch ( IOException e ) { }

	

    }//end newGame()


    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Warrior pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn()
    {
	int i = 1;
	int d1, d2;
	int patLives=pat.getLives();

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
	else {
		String dinosaur = "─────────────────────\n───────────████████──\n──────────███▄███████\n──────────███████████\n──────────███████████\n──────────██████─────\n──────────█████████──\n█───────███████──────\n██────████████████───\n███──██████████──█───\n███████████████──────\n███████████████──────\n─█████████████───────\n──███████████────────\n────████████─────────\n─────███──██─────────\n─────██────█─────────\n─────█─────█─────────\n─────██────██────────\n─────────────────────";
	    System.out.println( "\n Lo a monster appears!" + dinosaur);


	    if (Math.random()*100<(5*difficulty)){
		smaug= new Boss();
		System.out.println("\n The monster seems to be...  a BOSS!" );
		
	    }
	    else{
		smaug = new Monster();
	    }
	    while( smaug.isAlive() && pat.isAlive() ) {
		System.out.println("\n");
		System.out.println("__________________________________________");
		if (patLives> pat.getLives()){
		    System.out.println("The monster killed you. But your tales does not end just yet, you have "+ pat.getLives() + " lives left");
		    System.out.println("\n" + pat.getName()+ "'s HP:" + pat.getHP());		    
		}
		else{
		System.out.println("\n" + pat.getName()+ "'s HP:" + pat.getHP());
		}
		String heart = " ";
		for (int num = 0; num < pat.getLives(); num ++){
			heart += "♥ ";
		}
		
		System.out.println( pat.getName()+ "'s lives left:" + heart);
		
		System.out.println("The foul monster has "+ smaug.getHP()+ "HP left");
		System.out.println("__________________________________________");
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

		System.out.println( "\n" +pat.getName() + " dealt " + d1 +
				    " points of damage.");

		System.out.println( "\n" + "Ye Olde Monster smacked " +pat.getName() +
				    " for " + d2 + " points of damage.");

		//	System.out.println("\n" + pat.getName()+ "'s HP:" + pat.getHP());
		//	System.out.println("\n" + pat.getName()+ "'s lives left:" + pat.getLives());

	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 1.5  bootleg save to functionality
	    else if (pat.getLives()>0 && pat.getHP()>0 && !smaug.isAlive()){
		System.out.println("\n");
		System.out.println("__________________________________________");		
		if (patLives> pat.getLives()){
		    System.out.println("The monster killed you. But your tales does not end just yet, "+ pat.getLives() + " lives left");
		    System.out.println("\n" + pat.getName()+ "'s HP:" + pat.getHP());		    
		}
		else{
		System.out.println("\n" + pat.getName()+ "'s HP:" + pat.getHP());
		System.out.println( pat.getName()+ "'s lives left:" + pat.getLives());
		}
		String heart = " ";
		for (int num = 0; num < pat.getLives(); num ++){
			heart += "♥ ";
		}
		
		System.out.println( pat.getName()+ "'s lives left:" + heart);		
		System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );		
		return true;		

	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println("\n");
		System.out.println("__________________________________________");		
		if (patLives> pat.getLives()){
		    System.out.println("The monster killed you. But your tales does not end just yet, "+ pat.getLives() + " lives left");
		    System.out.println("\n" + pat.getName()+ "'s HP:" + pat.getHP());		    
		}
		else{
		System.out.println("\n" + pat.getName()+ "'s HP:" + pat.getHP());
		System.out.println( pat.getName()+ "'s lives left:" + pat.getLives());
		}
		String heart = " ";
		for (int num = 0; num < pat.getLives(); num ++){
			heart += "♥ ";
		}
		
		System.out.println( pat.getName()+ "'s lives left:" + heart);		
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
	//As usual, move the begin-comment bar down as you progressively 
	//test each new bit of functionality...

	//loading...
	YoRPG game = new YoRPG();

	int encounters = 0;

	while( encounters< MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	}

	System.out.println( "Thy game doth be over." );
    }//end main

}//end class YoRPG


