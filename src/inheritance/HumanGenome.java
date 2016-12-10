package inheritance;


public class HumanGenome {

	public static void main(String[] args) {
		
		Human h = new Human();
		h.numberOfEars();
		
		
		Mammals m = new Mammals();
		m.heights();
		m.Legs();
		
		Mammals.eyes();
	

	}

}
