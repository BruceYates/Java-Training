package chapter_09;

import java.util.*;

public class V2Radiator {
	//Constructor
	public V2Radiator(ArrayList list) {
		for(int x=0; x<5; x++) {
			list.add(new SimUnit("V2Radiator"));
		}
	}
}
