package sep19th;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		Map<String, String> hMap=new HashMap<String, String>();
		
		System.out.println(hMap.size());
		hMap.put("Manager", "Ravi");
		hMap.put("Team Lead", "Gopi");
		hMap.put("Tester", "John");
		hMap.put("Developer", "Sam");
		System.out.println(hMap.size());
		System.out.println(hMap);
		
		Set<Entry<String, String>> entries=hMap.entrySet();
		
		for(Entry<String, String> e:entries)
		{
			System.out.println(e.getKey()+"----"+e.getValue());
		}
		

	}

}
