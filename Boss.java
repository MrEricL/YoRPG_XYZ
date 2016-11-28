public class Boss extends Character {

    public Boss(){
	super();
	about="A super monster!";
	HP=900;
	strength= 170 + (int)(Math.random()* 50);
	defense= 100+ (int)(Math.random()*5);
	lives=3;
	attack=0.8+(int)(Math.random()*1.4);
    }

    public void specialize(){
	defense-=50;
	attack+=3;

    }
    public void normalize(){
	defense= 100+ (int)(Math.random()*5);
      	attack=0.8+(int)(Math.random()*1.4);


    }
    public String about(){
	String abt;
	abt="A super monster!!!!";
	return abt;



    }


}
