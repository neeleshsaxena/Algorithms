import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TwoSortedArrayIntoOne {
	
	public static void merge(int[] arr,int[] arr1){
		int n = arr1.length;
		int m = arr.length;
		
		
		for(int i=n-1;i>=0;i--){
			
			int j=0;
			int last = arr[m-1];
			for(j= m-2;j>=0 && arr[j]>arr1[i];j--){
				arr[j+1] = arr[j];
			}
			
			if(j!=m-2 || last>arr1[i]){
				arr[j+1] = arr1[i];
				arr1[i] = last;
			}
			
			
		}
		
		
		
		System.out.println("asas");
		
	}
	

	
	public static List<Integer> sortArraysIntoOne(int[] arr,int[] arr1){
		
	List<Integer> list = new ArrayList<>();
		
		int i=0,j=0;
		while(i<arr.length && j<arr1.length){
			
			if(arr[i]<arr1[j]){
				list.add(arr[i]);
				i++;
			}
			else if(arr1[j]<arr[i]){
				list.add(arr1[j]);
				j++;
			}
			
		}
		
		while(i<arr.length){
			list.add(arr[i]);
			i++;
		}
		
		while(j<arr1.length){
			list.add(arr1[j]);
			j++;
		}
		
		return list;
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,5,9,10,15,20};
		int[] arr1 = {2,3,8,13};
		
				//merge(arr, arr1);
		List<Integer> list = sortArraysIntoOne(arr, arr1);
		for(int i:list){
			System.out.println(i);
		}
		
	}

}
