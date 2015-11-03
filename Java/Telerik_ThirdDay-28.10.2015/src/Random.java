
public class Random {
	public static void main(String[] args){
		int min=5;
		int max = 10;
		int random1 =random(min,max);
		System.out.println(random1);
		random1 =random(max);
		System.out.println(random1);
		random1=random();
		System.out.println(random1);
		
	}

	private static int random() {
		return (int)(Math.random()*Integer.MAX_VALUE);
		
	}
	private static int random(int max) {
		return (int)(Math.random()*max);
		
	}
	private static int random(int min,int max) {
		return (int)(Math.random()*(max-min));		
	}

}
