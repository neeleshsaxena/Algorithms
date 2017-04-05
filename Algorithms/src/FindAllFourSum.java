import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FindAllFourSum {
	
	public static void print(List<Integer> list){
		
		
		for(int n:list){
			System.out.print(n+" ");
		}
		
		
	}
	
	public static boolean isValid(List<Integer> list, Map<Integer,Integer> intCountMap){
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<list.size();i++){
			if(map.containsKey(list.get(i))){
				map.replace(list.get(i), map.get(list.get(i))+ 1);
			}else{
				map.put(list.get(i), 1);
			}
			
			
		}
	
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			int key = (int)it.next();
			int val = map.get(key);
			if(intCountMap.get(key) < map.get(key)){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		
		for(int q=0;q<num;q++){
			
			int size = in.nextInt();
			int sum = in.nextInt();
			int[] arr = new int[size];
			Map<Integer,List<Integer>> map = new HashMap<>();
			Map<Integer,Integer> intCountMap = new HashMap<>(); 
			List<List<Integer>> mainList = new ArrayList<>();
			
			for(int i=0;i<size;i++){
				arr[i] = in.nextInt();
				if(intCountMap.containsKey(arr[i])){
					intCountMap.replace(arr[i], intCountMap.get(arr[i]) + 1);
				}else{
					intCountMap.put(arr[i], 1);
				}
				
				for(int j=i-1;j>=0;j--){
					List<Integer> list = new ArrayList<>();
					list.add(arr[i]);
					list.add(arr[j]);
					map.put(arr[i] + arr[j], list);
					
				}
				
			}
			
			Iterator it = map.keySet().iterator();
			while(it.hasNext()){
				
				int pairSum = (int)it.next();
				int otherPairSum = sum - pairSum;
				
				if(map.containsKey(otherPairSum)){
					
					
					List<Integer> list = new ArrayList<>();
					list.addAll(map.get(otherPairSum));
					list.addAll(map.get(pairSum));
					if(isValid(list, intCountMap)){
						Collections.sort(list);
						if(!mainList.contains(list)){
							mainList.add(list);
							print(list);
							System.out.print(" $");
						}
					}
					
					
				}
				
			}
			if(mainList.isEmpty()){
				System.out.println(-1);
			}else{
				System.out.println(" ");
			}
			
		}
		
	}

}
