package _3Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Create2 {

	public static void main(String[] args) {
		Stream<Integer> numbersFromValues = Stream.of(1, 2, 3, 4); 
		int[] numbers = {1, 2, 3, 4}; 
		IntStream numbersFromArray = Arrays.stream(numbers);
		
		System.out.println(numbersFromValues);
		System.out.println(numbersFromArray);
		
		Stream<String> words = Stream.of("Java", "Magazine", "is", 
			     "the", "best");

		 Stream<Object> letterToCount = words.map(w -> w.split(""))
		       .flatMap(Arrays::stream);
                       //.collect(Collectors.toCollection(ArrayList::new));
		 
		 String[] arrayOfWords = {"Java", "Magazine"};
		 String cadena = "Java Magazine";
		 Arrays.stream(arrayOfWords)
         .map(line ->  { 
        	 System.out.println("line " + line); 
        	 return line.split(""); }) // Stream<String[]>
         .flatMap(Arrays::stream) // Stream<String>
         .distinct() // Stream<String>
         .forEach( (p) -> { System.out.println("p: " + p);} );
	}

}
