import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class MinMaxLinkedList {
	
	
	public static LinkedList<Integer> insertionSort(LinkedList<Integer> list){
		int[] arr = covertToArray(list);
				
		for(int i=1;i<arr.length;i++){
			int val = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>val){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = val;
			
		}
		
		LinkedList<Integer> sortedList = convertToList(arr);
		return sortedList;
		
	}
	
	public static LinkedList<Integer> convertToList(int[] arr){
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i=0;i<arr.length;i++){
			list.add(arr[i]);
		}
		return list;
	}

	
	public static int[] covertToArray(LinkedList<Integer> list){
		
		Iterator it = list.iterator();
		int[] arr = new int[list.size()];
		int i=0;
		while(it.hasNext()){
			arr[i] = (int)it.next();
			i++;
		}
		return arr;
	}
	
	public static LinkedList<Integer> minMax(LinkedList<Integer> list){
		
		LinkedList<Integer> finalList = new LinkedList<Integer>();
		
		while(list.size()!=0){
			
			if(list.peekFirst()!=null){
				finalList.add(list.pollFirst());
			}
			if(list.peekLast()!=null){
				finalList.add(list.pollLast());
			}
			
		}
		

		return finalList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(8);
		list.add(10);
		list.add(9);
		
		LinkedList<Integer> sorted = insertionSort(list);
		
		LinkedList<Integer> result = minMax(sorted);
		
		for(int i =0;i<result.size();i++){
			System.out.print(result.get(i) + " ");
		}
		
		
	}

}
