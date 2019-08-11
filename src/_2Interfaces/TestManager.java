package _2Interfaces;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestManager {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3);
		System.out.println(stream.reduce(2, (s, n) -> s + n));
		
		Stream<Integer> stream3 = Stream.of(1, 2, 3);
		System.out.println(stream3.mapToInt(x -> x).sum());
		
		/*Optional optional = Optional.of(3);
		Optional<Integer> result = optional.map(String::length);*/
		

		Predicate<? super String> predicate = s -> s.startsWith("g");
		Stream<String> stream1 = Stream.generate(() -> "growl! ");
		Stream<String> stream2 = Stream.generate(() -> "growl! ");
		
		boolean b1 = stream1.anyMatch(predicate);
		boolean b2 = stream2.allMatch(predicate);
		
		System.out.println(b1 + " " + b2);
	}

}
