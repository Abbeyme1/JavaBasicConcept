package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("its",1);
		hm.put("nice",2);
		hm.put("text", 3);
		
		HashMap<String, Integer> om = new HashMap<>();
		
//		om.put("its",2);
		om.put("nice",2);
		om.put("text", 3);
		
		
		
		if(hm.entrySet().containsAll(om.entrySet())) System.out.println("yes");
		if(hm.keySet().containsAll(om.keySet())) System.out.println("yes");
		
		
		else System.out.println("no");
		
		
		for(Entry<String, Integer> s : hm.entrySet()) System.out.println(s.getValue());
		
		System.out.println("------");
		for(int i : hm.values()) System.out.println(i);
		System.out.println("------");
		
		
		TreeMap<String, Integer> tm = new TreeMap<>(hm);
		
		System.out.println(tm.keySet());
		
		
		hm.put("text",4);
		
		System.out.println(tm.get("text") + " " + hm.get("text"));
		
		
		HashMap<String, List<String>> l = new HashMap<>();
		
		List<String> teamA = new ArrayList<>();
		teamA.add("john");
		teamA.add("mark");
		teamA.add("tom");
		
		l.put("teamA", teamA);
		
		
		
		
		
		HashMap<String, String> managers = new HashMap<>();
		
		managers.put("e1", "m1");
		managers.put("e2", "m2");
		managers.put("e3", "m3");
		managers.put("m2", "m1");
		managers.put("m3", "m1");
		managers.put("m1", "m1");
		
		
		// remove emp. who report to m1
		
		managers.values().removeAll(Collections.singleton("m1"));
		
		System.out.println(managers);
//		Set<String> ss = Collections.singleton("m1");
		
		
//		System.out.println(ss);
		
		
		
		
		
		
		
		
	}

}
