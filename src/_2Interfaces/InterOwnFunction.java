package _2Interfaces;

import java.util.HashMap;
import java.util.Map;

public class InterOwnFunction {

	public static void main(String[] args) {
		SoloCadena solo = new SoloCadena();
		CuatroFunction<Double, Double, String, String> f1 = solo::damePuraCadenaByDouble;
		
		CuatroFunction<Integer, Integer, String, String> f2 = (i1, i2)-> solo.damePuraCadenaByInteger(i1, i2);
		
		System.out.println(f2.get(2, 3));
	}

}
class SoloCadena{
	Map<String, String> damePuraCadenaByInteger(Integer pri, Integer seg){
		Map<String, String> result = new HashMap<>();
		result.put(pri.toString(), seg.toString());
		return result;
	}
	Map<String, String> damePuraCadenaByDouble(Double pri, Double seg){
		Map<String, String> result = new HashMap<>();
		result.put(pri.toString(), seg.toString());
		return result;
	}
}
interface CuatroFunction<TP, TS, RP, RS>{
	Map<RP, RS>get(TP tp, TS ts);
}
