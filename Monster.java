//Team name: XYZ (Melanie Chow, Eric Li, Iris Tao)
//APCS1 Period 4
//HW #32: Ye Olde Role Playing Game, Expanded
//2016-11-21

public class Monster extends Character{
 
  

    //default constructor
    public Monster(){
	super();
	about="A creature that will attack you";
	HP=150;
	strength= 80  + (int)(Math.random() * (45));// [20,65)
	defense=80;
	attack=1;

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
	abt ="A Monster is a creature that attacks you.";
	
	return abt;
    }
	
}

	



	
