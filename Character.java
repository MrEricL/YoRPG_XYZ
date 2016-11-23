//Team name: XYZ (Melanie Chow, Eric Li, Iris Tao)
//APCS1 Period 4
//HW #34: Ye Olde Role Playing Game, Unchained
//2016-11-23

public class Character{
    protected String name;
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attack;
    protected String about;

	// ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~
	
	/*=============================================
      boolean isAlive -- returns boolean indicating living or dead
      pre:  
      post: Returns true if the warrior's HP is greater than 0 (warrior is still alive)
      Returns false it is less or equal to 0 (warrior dies)
      =============================================*/
    public boolean isAlive(){
	return HP>0;
    }
	
	/*=============================================
      int getDefense -- returns value of defense attribute
      pre:  
      post: Returns the current value of warrior's defense attribute
      =============================================*/
    public int getDefense(){
	return defense;
    }

 	/*=============================================
      String getName -- returns value of name attribute
	  pre:
      post: return warrior's name 
      =============================================*/
    public String getName(){
	return name;
    }	
	/*=============================================
      void lowerHP(int damage) -- takes an int parameter, decreases life attribute by that amount
      pre:  
      post: warrior's HP is decreased by the the amount of damage
      =============================================*/
    public void lowerHP(int damage){
	HP-=damage;
    }
	
	/*=============================================
      int attack ( Monster mon) -- takes a Monster as a parameter, calculates damage using this formula: damage = (strength * attack rating) - monster defense
      pre:  the getDefense, attack, and lowerHP methods work
      post: returns the amount of damage caused by the attack
      =============================================*/
    public int attack ( Character opponent){

 	int damage=0;
	if ((strength * attack) <= opponent.getDefense()){
	    damage=0;
	}
	else{
	    damage=(int) (strength * attack)-opponent.getDefense();
	}
	opponent.lowerHP(damage);
	return damage;
    }
    	
	/*=============================================
      void specialize -- prepares the warrior to perform a special attack
      pre:  defense and attack attributes have been initialized
      post: defense attribute decreases by 10, attack attribute increases by 1.
      =============================================*/
    public void specialize(){
	defense-=10;
	attack+=1;	
    }
	
	/*=============================================
      void normalize -- prepare the warrior to perform a normal attack
      pre:  defense and attack attributes have been initialized
      post: resets defense attribute to 100 and attack attribute to 0.5
      =============================================*/
    public void normalize(){
	defense=100;
	attack=.5;
    }
    public static String about(){
	String abt; 
	abt="A warrior is a physical knight. /n";
	abt+="A mage is a wizard. A magical being. /n";
	abt+=" A Rogue is a thief. A steally stabby. /n";
        abt+="A Monster is a creature that attacks you.";
	return abt;
    }
}
	
