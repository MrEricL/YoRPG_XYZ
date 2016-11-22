//Team name: XYZ (Melanie Chow, Eric Li, Iris Tao)
//APCS1 Period 4
//HW #32: Ye Olde Role Playing Game, Expanded
//2016-11-21

public class Warrior extends Character{
    //String about="Warrior: Physical knight";
	
	// ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected String name;
 
	
	// ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public Warrior(){
	name="player";
	HP=100;
	strength=100;
	defense=40;
	attack=.5;
    }
	
	// ~~~~~~~~~~ OVERLOADED CONSTRUCTOR ~~~~~~~~~~~
    public Warrior(String n){
	//this() invokes the default constructor to initialize other attributes (HP, strength, etc)
	this(); 
	name=n;
    }
	
	// ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		

}
