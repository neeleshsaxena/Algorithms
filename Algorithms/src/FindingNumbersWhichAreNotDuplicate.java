import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FindingNumbersWhichAreNotDuplicate {

	
	//http://www.practice.geeksforgeeks.org/problem-page.php?pid=1376
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		for(int i=0;i<num;i++){
			
			int n = in.nextInt();
			int size = 2*n+2;
			List<Integer> list = new ArrayList<>();
			Map<Integer,Integer> map = new HashMap<>();
			
			for(int j=0;j<size;j++){
				int key = in.nextInt();
				if(map.containsKey(key)){
					map.replace(key, map.get(key)+1);
				}else{
					map.put(key, 1);
				}
				
				
			}
			
			
			Iterator it = map.entrySet().iterator();
			
			while(it.hasNext()){
				Map.Entry ob = (Map.Entry)it.next();
				int key = (int)ob.getKey();
				int value = (int)ob.getValue();
				
				if(value==1){
					list.add(key);
				}
				
				
			}
			list.sort(null);
			for(int val:list){
				System.out.print(val +" ");
			}
			System.out.println(" ");
		}
	}

}
