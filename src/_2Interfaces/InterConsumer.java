package _2Interfaces;

import java.util.*;
import java.util.function.BiConsumer;

public class InterConsumer {

	public static void main(String[] args) {
		 /*Map<String, Integer> map = new HashMap<>();
		 BiConsumer<String, Integer> b1 =  map::put;
		 BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
		 b1.accept("chicken", 7);
		 b2.accept("chick", 1);
		 System.out.println(map);
		 
		 String ss = "aabbccddee";
		 BiConsumer2<String, String> s1 = ss::replaceAll;
		 ss = s1.accept("aa", "xx");
		 
		 System.out.println(ss);*/
		System.out.println(sum(5));
	}
	
	private static int sum(int i){
		if (i<3)
			return i;
		
		return sum(i-1)*sum(i-2);
	}
	
}