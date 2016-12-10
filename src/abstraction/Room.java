package abstraction;

public abstract class Room implements House {
	public void bedRoom(){
		System.out.println("This house has two bedroom");
	}
	public void kitchen(){
		System.out.println("has one kitchen room");
		
		
	}
	public void dinnerRoom(){
		System.out.println("dinnerroom is near the kitchen room");
	}
	public final void windowGlass(){
		System.out.println("the window glass is made up of Laminated Glass");
		
	}
	public abstract void bathRoom();
	public abstract void guestRoom();

}
