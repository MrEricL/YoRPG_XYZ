//Team name: XYZ (Melanie Chow, Eric Li, Iris Tao)
//APCS1 Period 4
//HW #32: Ye Olde Role Playing Game, Expanded
//2016-11-21

public class Mage extends Character{
    // String about="Mage: Magic person";
	// ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected String name;
 
	
	// ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public Mage(){
	name="player";
	HP=50;
	strength=200;
	defense=50;
	attack=.75;
    }
	
	
	// ~~~~~~~~~~ OVERLOADED CONSTRUCTOR ~~~~~~~~~~~
    public Mage(String n){
	//this() invokes the default constructor to initialize other attributes (HP, strength, etc)
	this(); 
	name=n;
    }			
	
	// ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
    public static void main(String[] args){

    }
}
