package sumIntegers;
import java.util.Scanner;

public class Startup {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String n="";
		int result=0;
		System.out.println("Enter sequence of positive integers  separated by spaces.");
		n=scanner.nextLine();
		scanner.close();
		result = sum.sumOfInt(n);
		System.out.printf("Result of this seqence (%s) is: %s \n",n,result);
	}
}
