package sqrtcalc;
public class calc {
	private static int MAX_VALUE = 10000;
	private static double[] squares;
	
	//Статик се изпълнва първо и иницилялизира масива
	static{
		squares = new double[MAX_VALUE];
	}
	
	public static double getSqrt(int value){
		if(squares[value]==0.0){
			squares[value]=Math.sqrt(value);
		}
		
		return squares[value];
	}
}
