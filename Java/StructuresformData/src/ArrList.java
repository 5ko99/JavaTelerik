import java.util.ArrayList;
import java.util.LinkedList;

public class ArrList {
	public static void main(String[] args){
		ArrayList<Integer> list= new ArrayList<>();
		list.add(0, 5);
		for (int i = 0; i < 6; i++) {
			list.add(i,i-2);
			System.out.println(list.toArray()[i]);
		}
		System.out.println(list.size());
		System.out.println(list);
		System.out.println("-------------------------------------------------");
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.addFirst(5);
		list2.addLast(8);
		list2.add(1,55);
		System.out.println(list2);
	}
}
