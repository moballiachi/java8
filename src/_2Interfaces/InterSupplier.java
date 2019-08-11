package _2Interfaces;

import java.util.*;
import java.util.function.Supplier;

public class InterSupplier {

	public static void main(String[] args) {
		Supplier2<ArrayList<AuxSupplier>> s1 = ArrayList<AuxSupplier>::new;
		ArrayList<AuxSupplier> a1 = s1.get();
		System.out.println(a1);
	}
	
	

}
@FunctionalInterface interface Supplier2<T>{
	T get();
}
class AuxSupplier {
	
	public AuxSupplier(String g){
		
	}
	
	@Override
	public String toString() {
		return "lase auxiliar";
	}
}