package _3Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Predicate;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Create {

	
	public static void main(String[] args) {
		
		/*Stream<String> infinites = Stream.generate(() -> "chimp");
		infinites.limit(3).forEach(System.out::println); // chimp
		
		 Stream<String> s = Stream.of("duck", "duck", "duck", "goose");  
		 s.distinct().forEach(System.out::print); // duckgoose
		/*
		 * 1999938123
		 *  
		 *
		 List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> fromList = list.stream(); 
		Stream<String> fromListParallel = list.parallelStream(); 
		
		 Stream<Double> randoms = Stream.generate(Math::random); 
		 Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);*/ 

		 Stream.generate(() -> "Elsssssa")   
			 .filter(n -> n.length() == 4) 
			 .limit(2)
			 .sorted()      .forEach(System.out::println);
		 
		 
		 /*Stream<String> s = Stream.of("0000", "1434");
		 Optional<String> min = s.min((s1, s2) -> s1.length() + s2.length());
		 min.ifPresent(System.out::println); // ape
		 
		 /*Stream<String> stream = Stream.of("w", "o", "l", "f"); 
		 String word = stream.reduce(" ", (s1, c) -> s1 + c); 
		 System.out.println(word);    // wolf 
		 
		 Stream<Integer> streamN = Stream.of(3, 5, 6);
		 System.out.println(streamN.reduce(2, (a, b) -> a*b));
		 
		 //streamN.forEach(System.out::print); ? super
		 
		 List<String> listt = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		 listt.stream().filter(n -> n.length() == 4).sorted().limit(3).forEach(System.out::println);
		 
		 Stream.generate(() -> "Elsa")
		   .filter(n -> n.length() == 4)
		   .limit(2)
		   .sorted()
		   .forEach(System.out::println);
		   
		 Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
		 infinite .limit(5)
		         //.peek(System.out::print)
		         .filter(x -> x % 2 == 1)
		         .forEach(System.out::print);*
		 
		 Stream<String> stream = Stream.iterate(".", s -> s + "1");
		 //System.out.println(stream.limit(2).map(x -> x + "2"));
		 stream.limit(5).map(x -> x + "2 ,").forEach(System.out::println);
		 
		 Predicate<? super String> predicate = s -> s.startsWith("g");
		 Stream<String> stream1 = Stream.generate(() -> "growl! ");
		 Stream<String> stream2 = Stream.generate(() -> "growl! ");
		 boolean b1 = stream1.limit(5).anyMatch(predicate);
		 boolean b2 = stream2.limit(5).allMatch(predicate);
		 System.out.println(b1 + " " + b2);
		 
		 LongStream ls = LongStream.of(1, 2, 3);
		 OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
		 
		 //if (opt.isPresent()) System.out.println(opt.get());
		 if (opt.isPresent()) System.out.println(opt.getAsLong());
		 //opt.ifPresent(System.out.println);
		 opt.ifPresent(System.out::println);
		 
		 t t = new t();*/
	}

}

class t {
	{System.out.println("statement");}
	static {System.out.println("static");}
	t(){
		System.out.println("Constructor");
	}
}