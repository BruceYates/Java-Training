package chapter_09;

import java.util.*;

public class V3Radiator {  //extends V2Radiator {
	//Constructor
	public V3Radiator(ArrayList lglist) {
		//super(lglist);
		for(int g=0; g<10; g++) {
			lglist.add(new SimUnit("V3Radiator"));
		}
	}
}
