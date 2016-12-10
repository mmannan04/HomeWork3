package abstraction;

public class TestHouse {

	public static void main(String[] args) {
		NewRoom newroom = new NewRoom();
		newroom.bedroom();
		newroom.dinnerroom();
		newroom.kitchen();
		
		Room room =new NewRoom();
		room.bathRoom();
		room.guestRoom();
		
		NewRoom.windows();
		NewRoom.doors();
		
		room.windowGlass();
		
	}

}
