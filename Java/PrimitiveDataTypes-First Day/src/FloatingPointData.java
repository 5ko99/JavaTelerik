import java.math.BigDecimal;
public class FloatingPointData {
	public static void main(String[] args){
		
		float floatNum = 0.667f;
		double doubleNum = 1.133;
		BigDecimal dNum = BigDecimal.valueOf(1.333);
		BigDecimal fNum = BigDecimal.valueOf(0.667);
		System.out.println(dNum.add(fNum));
		System.out.println(floatNum+doubleNum);
	}
}
