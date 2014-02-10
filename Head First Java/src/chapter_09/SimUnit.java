package chapter_09;

public class SimUnit {
	String botType;

	//Constructor
	public SimUnit(String type) {
		botType = type;
		if ("Retention".equals(botType)) {
			System.out.println("Retention: ");
		} else if ("V2Radiator".equals(botType)) {
			System.out.println("V2Raditor: ");
		} else if ("V3Radiator".equals(botType)) {
			System.out.println("V3Raditor: ");
		} else {
			System.out.println("Invalid Bot Type");
		}
	}
	
	int powerUse() {
		if ("Retention".equals(botType)) {
			System.out.println("Retention");
			return 1;
		} else if ("V2Radiator".equals(botType)) {
			System.out.println("V2Raditor");
			return 1; 
		} else if ("V3Radiator".equals(botType)) {
			System.out.println("V3Raditor");
			return 2;
		} else {
			System.out.println("Invalid Bot Type");
			return 0;
		}
	}
}
