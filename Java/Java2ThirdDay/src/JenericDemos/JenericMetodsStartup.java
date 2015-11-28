package JenericDemos;
public class JenericMetodsStartup {
	public static void main(String[] args){
		String[] arr = {
				"abc",
				"bca",
				"ccc",
				"petko",
				"ZenPhone",
				"CSGO",
				"Adam1"
		};
		String result = getMin(arr);
		System.out.println(result);
		Integer[] arr2={
				1,23,4,68,2,4
		};
		Integer result2 = getMin(arr2);
		System.out.println(result2);
	}
	

	
	public static <T extends Comparable<T>  >T getMin(T[] items){
		T min = items[0];
		for (int i = 0; i < items.length; i++) {
			if (min.compareTo(items[i])>0){
				min=items[i];
			}
		}
		return min;
	}
}
