package StreamingApi;
import java.util.*;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
public class streaming {
	
	public static void main(String[] args){
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();
		list.stream()
		.filter (n -> n%2==0)
		.forEach(arr::add);
		
		System.out.println("Here");
		System.out.println(list.size());
	}
	
}
