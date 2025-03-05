public class Main
{
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "A");
        treeMap.put(20, "B");
        treeMap.put(30, "C");
        treeMap.put(40, "D");
        System.out.println(treeMap.floorKey(25)); 
        System.out.println(treeMap.ceilingKey(25)); 
	}
}
