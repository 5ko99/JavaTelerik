import java.util.Scanner;
public class Factoriel {
	public static long FactorielCalc (long factoriel){
		long result=1;
		do{
			result*=factoriel;
					factoriel--;
		}
		while(factoriel>1);
		return result;
	}
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("n=");
		long n = scanner.nextLong();
		long result = FactorielCalc(n);
		System.out.printf("Factoriel of %d is: %d",n,result);
		scanner.close();
	}
}
