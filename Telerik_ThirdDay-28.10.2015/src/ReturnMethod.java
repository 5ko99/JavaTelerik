import java.util.Scanner;

public class ReturnMethod {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a,b;
		System.out.print("a=");
		a = scanner.nextInt();
		System.out.print("b=");
		b = scanner.nextInt();
		int result = bigger(a,b);
		System.out.printf("Bigger nummber is: %d",result);
		scanner.close();
	}

	private static int bigger(int a,int b) {
		if(a>b){
			return a;
		}
		else{
			return b;
		}
		
	}
}
