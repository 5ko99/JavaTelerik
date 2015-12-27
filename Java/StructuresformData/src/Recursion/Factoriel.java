package Recursion;

public class Factoriel {
	public static void main(String args[]){
		int n =5;
		long result = factoriel(n);
		System.out.printf("Factoriel from %s =\n",n);
		System.out.println(result);
	}
	
	public static long factoriel(int num){
		if(num==0){
			return 1;
		}

		return num*factoriel(num-1);
	}
	
}
