package polyphormism;

public class TestBuilding {

	public static void main(String[] args) {

		BuildingShape bs = new BuildingShape();
		int rectangleSize = bs.Rectangle(11, 12, 12, 11);
		System.out.println(rectangleSize);
		int pentagonSize = bs.Rectangle(11, 12, 12, 11, 14);
		System.out.println(pentagonSize);
		BuildingShape bigBuilding = new Building();
		int bigrectangleSize = bigBuilding.Rectangle(11, 12, 12, 11, 14);
		System.out.println(bigrectangleSize);

		


	}

}
