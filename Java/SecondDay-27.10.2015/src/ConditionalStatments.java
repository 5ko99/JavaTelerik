import java.util.*;
public class ConditionalStatments {
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please entter Password: ");
		String password = scanner.nextLine();
		if(password.length()>=6){
			System.out.println("Your password is Correct!");
		}
		else {
			System.out.println("Incorect Password!");
		}
		scanner.close();
	}
}
