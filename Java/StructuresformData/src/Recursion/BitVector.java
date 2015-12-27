package Recursion;

public class BitVector {
	private static int vector[];
	public static void main(String[] args){
		int num=3;
		vector = new int[num];
		gen01(0);
	}
	private static void gen01(int index) {
		if(index==vector.length){
			printArray();
			return;
		}
		
		vector[index]=1;
		gen01(index+1);
		
		vector[index]=0;
		gen01(index+1);
		
	}
	
	private static void printArray() {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%s",vector[i]);
		}
		System.out.println();
	}
	
}
