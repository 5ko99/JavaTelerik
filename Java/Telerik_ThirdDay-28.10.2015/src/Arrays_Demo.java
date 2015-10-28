import java.util.Scanner;

public class Arrays_Demo {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("n=");
		int n = scanner.nextInt();
		int[] intArray = new int[n];
		//read input
		for(int i=0;i<n;i++){
			System.out.printf("arr[%d]=",i);
			intArray[i]=scanner.nextInt();
		}
		
		//process date766
		int result = intArray[0];
		for(int i=1;i<n;i++){
			if(intArray[i]>result) result=intArray[i];
		}			
		
		//output
		System.out.printf("Max Value Is: %d",result);
		
		//Scanner Closing
		scanner.close();
	}
}
