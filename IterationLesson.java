import java.util.*;

public class IterationLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> list = new ArrayList<>();
//		list.add("Tola");
//		list.add("Bimpe");
//		list.add("Lasisi");
//		Iterator<String> iterator = list.iterator();
		
//		Map<String, String> map = new HashMap<>(); 
//		map.put("key1", "Valentino");
//		map.put("key2", "Lolade");
//		map.put("key3", "Picaso");
//		Iterator<String> keyIterator = map.keySet().iterator();
//		Iterator<String> valueIterator = map.values().iterator();
//		while(keyIterator.hasNext()) {
//			System.out.println(keyIterator.next());
//		}
//		System.out.println("********************************");
//		while(valueIterator.hasNext()) {
//			System.out.println(valueIterator.next());
//		}
		
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
		
		Set<String> set = new HashSet();
		set.add("Jane");
		set.add("Frederick");
		set.add("Gringo");
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("The next person is: " + iterator.next());
		}
	}

}
