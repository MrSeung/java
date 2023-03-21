package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class BufferedReaderEx02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("out.txt"));
		//FileWriter fw=new FileWriter("out1.txt");
		PrintWriter pw=new PrintWriter("out1.txt");
		Map<String, Integer> map=new TreeMap<>();		
		
		while(true) {
			String str=br.readLine();
			if(str==null) break;
			String name=str.substring(0,str.indexOf(" "));
			int age=Integer.parseInt(str.substring(str.indexOf(" ")+1));
			map.put(name, age);
			
			//System.out.println(str);
		}
		//System.out.println("복사완료!");
		int cnt=0;
		int sum=0;
		for(String s:map.keySet()) {
			System.out.println(s+":"+map.get(s));
			cnt++;
			sum+=map.get(s);
			pw.println(s+":"+map.get(s));
		}
		System.out.println("총원:"+cnt+" 총합:"+sum);
		pw.println("총원:"+cnt+" 총합:"+sum);
		
		if(br!=null) {
			br.close();
		}
		if(pw!=null) {
			pw.close();
		}
		
	}
	

}
