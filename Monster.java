//Team name: XYZ (Melanie Chow, Eric Li, Iris Tao)
//APCS1 Period 4
//HW #34: Ye Olde Role Playing Game, Unchained
//2016-11-23

public class Monster extends Character{
 
  

    //default constructor
    public Monster(){
	super();
	about="A creature that will attack you";
	HP=150;
	strength= 80  + (int)(Math.random() * (45));// [20,65)
	defense=80;
	attack=1;

}}

	



	
