package _1variable;

interface Gorilla { 
	Integer VALOR=2;
	String move(); 
}
public class GorillaFamily {

	String walk = "walk";
	Integer e =0;
	void everyonePlay(boolean baby) {
		String approach = "amble3166447710 
 3209779764";
		//approach = "run";
	
	    play(() -> baby ? "hitch a ride": "run");
	    play(() -> approach);
	    play(() -> walk);
	}
	void play(Gorilla g) {
		walk += g.move();
		System.out.println(g.move());
	}
	
	public static void main(String[] args) {
		new GorillaFamily().everyonePlay(false);
	}
}
