import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MissingNumbers {

	/*10
	203 204 205 206 207 208 203 204 205 206
	13
	203 204 204 205 206 207 205 208 203 206 205 206 204*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
	        int num = in.nextInt();
	        
	        Map<Integer,Integer> map = new HashMap<>();
	        for(int i=0;i<num;i++){
	            
	           int a = in.nextInt();
	           if(map.containsKey(a)){
	        	   map.replace(a, map.get(a), map.get(a)+1);
	           }else{
	        	   map.put(a, 1);
	           }
	            
	            
	            
	        }
	        
	        //next set of numbers
	        
	        int num1 = in.nextInt();
	        Map<Integer,Integer> mapB = new HashMap<>();
	        for(int j=0;j<num1;j++){
	        	  int a = in.nextInt();
		           if(mapB.containsKey(a)){
		        	   mapB.replace(a, mapB.get(a), mapB.get(a)+1);
		           }else{
		        	   mapB.put(a, 1);
		           }
	        	
	        }
	        
	        Iterator it = mapB.entrySet().iterator();
	        
	        while(it.hasNext()){
	        	Map.Entry pair = (Map.Entry)it.next();
	        	int key = (int)pair.getKey();
	        	int val = (int)pair.getValue();
	        	
	        	int value = map.get(key);
	        	
	        	if(val!=value){
	        		System.out.print(key + " ");
	        	}
	        }
	        
	}

}
