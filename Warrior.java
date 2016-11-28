//Team name: XYZ (Melanie Chow, Eric Li, Iris Tao)
//APCS1 Period 4
//HW #34: Ye Olde Role Playing Game, Unchained
//2016-11-23

public class Warrior extends Character{
    //String about="Warrior: Physical knight";
	
	// ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected String name;
 
	
	// ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public Warrior(){
	lives=3;
	name="player";
	//HP=100;
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
	String abt ="\n\n\n\n=======NEW GAME=======\n\nA warrior is a physical knight \nOn the sword you shed lights\nYou fight until you die.  \n====================\n\n";
	
	String war ="xxxx[{::::::::::::::::::::>\n\nxxxx[{::::::::::::::::::::>\n\nxxxx[{::::::::::::::::::::>\n ";
    abt += war;
	return abt;

    }
}
