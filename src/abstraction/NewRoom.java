package abstraction;

public class NewRoom extends Room {

	public static void windows(){
		System.out.println("this room has three windows");
	}
	public static void doors(){
		System.out.println("this room has four doors");
	}


    @Override
	public void bedroom() {
		System.out.println("bed room is located near the kitchen counter");
		
	}
	public void dinnerroom() {
		System.out.println("dinnerroom is near the kitchen room");
		
	
	}

	public void bathRoom() {
			System.out.println("bathroom located at the corner");	
	}

	public void guestRoom() {
			System.out.println("Guestroom has similar feature as rest of of the rooms");
		
		
	}

}
