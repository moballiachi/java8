package _2Interfaces;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class InterFuntion {

	//private static final String new String() = null;

	public static void main(String[] args) {
		BiFunction<String, String, String> b1 =  String::concat;
		BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
		BiFunction<String, String, Integer> b3 = String::indexOf; // (str, fromIndex) -> str.indexOf(str, fromIndex);
		System.out.println(b1.apply("baby ", "chick")); // baby chick
		System.out.println(b3.apply("baby ", "a")); // baby chick
		String g = "";
		Function<String, Integer> ex1 = String::length; //x -> x.get(0);
		UnaryOperator<Long> ex2 = (Long l) -> 3L;
		//Supplier<Boolean> ex4 = String::isEmpty;
		System.out.println(Double.NaN);
		
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		String word = stream.reduce("*", String::concat);
		System.out.println(word);
	}

}
