import java.util.SortedMap;
import java.util.TreeMap;

public class ContohTailMap {
	public static void main(String[] args){
		TreeMap treeMap = new TreeMap();
		treeMap.put("1","Satu");
		treeMap.put("3","Tiga"); 
		treeMap.put("2","Dua");
		treeMap.put("5","Lima"); 
		treeMap.put("4","Empat");
		SortedMap sortedMap = treeMap.tailMap("2");
		System.out.println("Tail Map memiliki: "+sortedMap);
	}
}