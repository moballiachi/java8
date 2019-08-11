package _3Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Secuencia6 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 8, 2, 2, 6, 3, 4, 5, 6, 7, 8); 
		List<Integer> twoEvenSquares = 
		numbers.stream().distinct().sorted().skip(3)    
		.filter(n -> {     
		System.out.println("filtering " + n);   
		return n % 2 == 0;    
		})    
		.map(n -> {     
		System.out.println("mapping " + n);     
		return n ;    
		})    
		.limit(2)
		.collect(Collectors.toCollection(ArrayList::new));
		//.collect(Collectors.toList());
		System.out.println("twoEvenSquares: " + twoEvenSquares);
		
		Set<Integer> mySet = numbers.stream()
				.collect(Collectors.toSet()); 
		
		System.out.println("mySet: " + mySet);
		
		Optional<Integer> thirdEvenSquares = 
				Arrays.asList(1, 2, 2, 6, 3, 4, 5, 6, 7, 8).stream()
				.findAny()
		;
		System.out.println(thirdEvenSquares);
		
		List<Integer> anumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		int sum = anumbers.stream().reduce(0, (a, b) -> a + b);
		
		System.out.println(sum);
		/*List<Integer> transactions ;
		boolean expensive =   
				transactions.stream()   
				.allMatch(t -> t.getValue() > 100);*/
		
		int statement = 
				anumbers.stream()   
				.mapToInt(a -> a)   
				.sum();
		System.out.println("statement:" + statement);
		
		IntStream oddNumbers = 
				IntStream.rangeClosed(10, 30)  
				.filter(n -> { /*System.out.println("filtering* " + n);*/ return n % 2 == 1;}).skip(6);
		System.out.println("oddNumbers:" + oddNumbers.min());
	}

}
