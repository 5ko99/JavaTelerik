package Recursion;
public class generatingCombinations {
	private static int result[];
	public static void main(String[] args){
		int num=3;
		int k = 3;
		int[] elem = {4,5,6,7,8};
		result = new int[num];
		generate(0,elem,result);
	}
	
	private static void generate(int i,int[] arr,int[] result) {
		if(i==result.length){
			printArray();
			return;
		}
		
		for (int j = i; j < arr.length; j++) {
			result[i] = arr[j];
			generate(i+1, arr, result);
		}
		
	}
	
	private static void printArray() {
		for (int i = 0; i < result.length; i++) {
			System.out.printf("%s",result[i]);
		}
		System.out.println();
	}
	
}
