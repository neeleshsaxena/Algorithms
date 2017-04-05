import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaximumIndexGoogle {
	
	public static class obj{
		int id;
		int data;
	}

	private static int maxIndex(int[] arr){
		int maxDiff = -1;
		int n = arr.length;
		int[] rMax = new int[n];
		int[] lMin = new int[n];
		
		lMin[0] = arr[0];
		for(int i=1;i<n;i++){
			lMin[i] = Math.min(lMin[i-1], arr[i]);
		}
		
		rMax[n-1] = arr[n-1];
		for(int i=n-2;i>=0;i--){
			rMax[i] = Math.max(rMax[i+1], arr[i]);
		}
		
		int i=0, j=0;
		while(j<n && i<n){
			if(lMin[i] < rMax[j]){
				maxDiff = Math.max(maxDiff, j-i);
				j = j+1;
			}else{
				i = i+1;
			}
			
		}
		
		
		/*Comparator<obj> comp = new Comparator<obj>(){
			
			@Override
			public int compare(obj obj1,obj obj2){
				if(obj2.data>obj1.data){
					return 1;
				}else if(obj1.data>obj2.data){
					return -1;
				}
				else {
					return 0;
				}
			}

		};
		List<obj> list = new ArrayList<>();
		Collections.sort(list, comp);
		
		*/
		
		
		return maxDiff;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {6, 5, 4, 3, 2, 1};
		int maxDiff = maxIndex(arr);
		
		System.out.println(maxDiff);
	}

}
