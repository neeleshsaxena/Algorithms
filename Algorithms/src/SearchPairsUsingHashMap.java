import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class SearchPairsUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 Scanner in = new Scanner(System.in);
	        
	        int size = in.nextInt();
	        
	        int value = in.nextInt();
	        

			Map<Integer,Integer> map = new HashMap<>();
			for(int i=0;i<size;i++){
				map.put(in.nextInt(), i);
			}
			
	        pairs(map,value);
	        

	}

	
	public static void pairs(Map<Integer,Integer> map, int sum){
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry ob = (Map.Entry)it.next();
			int key = (int)ob.getKey();
			
			// to find the diff of pairs ->  temp = sum + key
			int temp = sum - key;  //this is for addition
			
			if(map.containsKey(temp)){
				System.out.println("the pairs are (" + key +" , "+ temp+")");
			}
			
		}
		
		
	}
}
