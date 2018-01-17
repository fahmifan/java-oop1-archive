import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class CopyElementsOfArrayListToVectorExample {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("1");
		arrayList.add("4");
		arrayList.add("2");
		arrayList.add("5");
		arrayList.add("3");
		
		Vector<String> v = new Vector<>();
		v.add("B");
		v.add("D");
		v.add("E");
		v.add("F");
		v.add("G");
		v.add("H");
		System.out.println("Before copy, Vector Contains : " +v);
		
		Collections.copy(v,arrayList);
		System.out.println("After Copy, Vector Contains : " +v);
	}
}