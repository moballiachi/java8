package _2Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalTest {

	public static void main(String[] args) {
		Optional<Double> valueOpt = average(4);
		System.out.println(valueOpt);
		
		valueOpt.ifPresent(OptionalTest::imprimir);
		
		System.out.println(valueOpt.orElse(-1.0));
		System.out.println(valueOpt.orElseGet(() -> -2.0));
		System.out.println(valueOpt.orElseThrow(() -> new IllegalStateException()));
		//Optional o = Optional.ofNullable(value);
		//System.out.println(o);
	}

	public static Optional<Double> average(int... scores) {
		Double sum = null;
		if (scores.length != 0) {
			sum = 0.0;
			for (int score: scores) 
				sum += score;
			sum /= scores.length;
		}
		return Optional.ofNullable(sum);
	}
	
	public static void imprimir(double value){
		System.out.println("Toma la impresion: " + value);
	}
}
