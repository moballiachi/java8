package _2Interfaces;

import java.util.Locale;
import java.util.function.BiPredicate;

public class InterPredicate {

	public static void main(String[] args) {
		String t = new String("dale");
		BiPredicate<String, String> b1 =  String::startsWith;
		BiPredicate<String, String> b2 = (string, prefix) -> t.startsWith(prefix);
		System.out.println(b1.test("chicken", "chick"));
		System.out.println(b2.test("chicken", "chick"));
		
		Locale locale = Locale.getDefault();
		System.out.println(locale);
	}

}
