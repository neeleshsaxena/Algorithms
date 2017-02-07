import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SearchFirstOccuringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<num;i++){
			int key = in.nextInt();
			
			
			if(map.containsKey(key)){
				map.put(key, -map.get(key));
			}
			else{
				map.put(key, i+1);
			}
		}
		
		int maxValue = Integer.MIN_VALUE;
		int maxKey = 0;
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()){
			
			
			Map.Entry obj = (Map.Entry) it.next();
			
			
			
			int key = (int)obj.getKey();
			int value = (int)obj.getValue();
			
			
			if(value<0 && value>maxValue){
				maxKey = key;
				maxValue = value;
				
			}
			
		}
		
		
		
		System.out.println("the dup are "+ maxKey);
		
		
		
		/*for(int i=0;i<num;i++){
			int key = in.nextInt();
			if(map.containsKey(key) && map.get(key)>0){
				
				map.replace(key, -map.get(key));
			}
			else if(!map.containsKey(key)){
				map.put(key, i+1);
			}
			
		}*/

		
		/*Iterator it = map.entrySet().iterator();
		int  maxKey=0;
		int maxvalue =Integer.MIN_VALUE;
		
		while(it.hasNext()){
			Map.Entry obj = (Map.Entry)it.next();
			int key = (int)obj.getKey();
			int val = (int)obj.getValue();
			
			if(val<0 && val>maxvalue){
				maxvalue = val;
				maxKey = key;
			}
			
		}*/
		System.out.println("The first duplicate value is " + maxKey);
	}

}
