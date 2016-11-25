//Team name: XYZ (Melanie Chow, Eric Li, Iris Tao)
//APCS1 Period 4
//HW #34: Ye Olde Role Playing Game, Unchained
//2016-11-23

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
	
	// ~~~~~~~~~~~~~~ ABSTRACT METHODS ~~~~~~~~~~~~~~~~~
    public void specialize(){
	defense-=10;
	attack+=1;	
    }
	
	public void normalize(){
	defense=100;
	attack=.5;
    }
	
	public String about(){
	String abt; 
	abt ="A mage is a wizard. A magical being. /n";
	
	return abt;
    }
	
	
}
