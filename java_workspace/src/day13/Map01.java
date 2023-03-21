package day13;
import java.util.*;

public class Map01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=new HashMap<>();
		map.put("햄버거",5000);
		map.put("피자",25000);
		map.put("음료",2500);
		map.put("치킨",21000);
		
		int sum=0;
		int num=0;
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.get("햄버거"));
		
		Iterator<String> it =map.keySet().iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str+":"+map.get(str));
		}
		System.out.println("---------------------");
		for(String str:map.keySet()) {
			System.out.println(str+":"+map.get(str));
		}
		System.out.println("---------------------");
		for(Map.Entry<String, Integer> tmp:map.entrySet()) {
			System.out.println(tmp.getKey()+":"+tmp.getValue());
		}
		System.out.println("---------------------");
		for(Map.Entry<String, Integer> s:map.entrySet()) {
			//int sum=0;
			sum+=s.getValue();
		}
		System.out.println(sum);
		System.out.println("---------------------");
		for(String s1:map.keySet()) {
			//int n=0;
			num+=map.get(s1);
		}
		System.out.println(num);
		
	}

}
