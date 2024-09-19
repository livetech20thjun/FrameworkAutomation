package sep19th;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {

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
		
		Iterator<Entry<String, String>>  it=entries.iterator();
		
		while(it.hasNext())
		{
			Entry<String, String> e=it.next();
			System.out.println(e.getKey()+"------"+e.getValue());
		}

	}

}
