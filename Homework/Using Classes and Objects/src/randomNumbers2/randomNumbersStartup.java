package randomNumbers2;

import java.util.*;

public class randomNumbersStartup {
	public static void main(String[] args){
		
		Random random = new Random();
		int[] randomInt = new int[9];
		
		for (int i = 0; i < 9; i++) {
			randomInt[i] = random.nextInt(200-100+1)+100;
			System.out.printf("Random[%s]=%s \n",i,randomInt[i]);
		}
	}
}
