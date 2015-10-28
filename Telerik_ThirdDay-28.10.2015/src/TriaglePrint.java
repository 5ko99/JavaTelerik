import java.util.Scanner;

public class TriaglePrint {
	public static void main(String[] args){
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("N=");
		n=scanner.nextInt();
		System.out.println();
		print(n);
		scanner.close();
	}
	
	static void print(int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<i+1;j++){
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
		for(int i=n-1;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
}
