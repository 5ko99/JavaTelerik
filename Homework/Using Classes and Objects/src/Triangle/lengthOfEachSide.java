package Triangle;
public class lengthOfEachSide {
	public static double calc(double a,double b,double c){
		double s=(a+b+c)/2;
		double S=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return S;
	}
}
