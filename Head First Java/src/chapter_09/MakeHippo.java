package chapter_09;

public class MakeHippo {

	public static void main(String[] args) {
		//Make a Hippo, passing the name "Buffy" to the Hippo constructor. 
		Hippo h = new Hippo("Buffy");
		//Then call the Hippo's inherited getName.
		System.out.println(h.getName());
	}
}
