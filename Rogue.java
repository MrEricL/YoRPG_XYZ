//Team name: XYZ (Melanie Chow, Eric Li, Iris Tao)
//APCS1 Period 4
//HW #34: Ye Olde Role Playing Game, Unchained
//2016-11-23

public class Rogue extends Character{
    //String about="Rogue: Steally stabby";
	
	// ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected String name;
 
	
	// ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public Rogue(){
	name="player";
	//HP=100;
	strength=150;
	defense=75;
	attack=1.25;
	lives=3;
    }
	
	// ~~~~~~~~~~ OVERLOADED CONSTRUCTOR ~~~~~~~~~~~
    public Rogue(String n){
	//this() invokes the default constructor to initialize other attributes (HP, strength, etc)
	this(); 
	name=n;
    }
	
	// ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
    public static void main(String[] args){
	//Warrior jello=new Warrior("Jello");
	//System.out.println(jello.HP);
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
	abt ="\n\n\n\n=======NEW GAME=======\n\nA rogue is an embezzler\nYou lie and lie\nSo that you don't cry and die.";
	
	return abt;
    }
}
