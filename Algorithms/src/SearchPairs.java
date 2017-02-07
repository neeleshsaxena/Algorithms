import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SearchPairs {
	 public static int[] sort(int[] arr){
	        
	        for(int i=1;i<arr.length;i++){
	            int val = arr[i];
	            int j= i-1;
	            
	            while(j>=0 && arr[j]>val){
	                arr[j+1] = arr[j];
	                j = j-1;
	                
	            }
	            arr[j+1] = val;
	        }
	        return arr;
	    }
	 
	 //nlogn
	 //two pointer approach
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        
	        int size = in.nextInt();
	        
	        int value = in.nextInt();
	        int[] arr = new int[size];
	        for(int i=0;i<size;i++){
	            arr[i] = in.nextInt();
	        }
	        
	        //need to sort the array first for this approach
	        int[] sortedArr = sort(arr);
	        
	        
	        int pairs = 0;
	        int j=0;
	        int k=1;
	            while(k<size){
	                 int val = Math.abs(sortedArr[j] - sortedArr[k]);
	                if(val==value){
	                    pairs++;
	                    k++;
	                }else if(val>value){
	                    j++;
	                }else if(val<value){
	                    k++;
	            }
	               
	                
	        }
	        System.out.print(pairs);
	}

}
