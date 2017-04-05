import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	
	 public static void sort(int[] array) {
		    
		  Quicksort(array, 0, array.length-1);
		  }
		  
	 private static void Quicksort(int[] array, int first, int last) {
		
		 if(first<last){
			 
			 int mid = partition(array, first, last);
			 
			 Quicksort(array, first, mid);
			 Quicksort(array, mid + 1, last);
		 }

		  }
	 
	 private static int partition(int array[], int first, int last) {
		  
		 int x = array[first];
		 
		 int i = first -1;
		 
		 int j = last +1;
		 
		 while(true){
			 
			 do{
				 j--;
			 }while(array[j]>x);
			 
			 do{
				 i++;
			 }while(array[i]<x);
			 
			 if(i<j){
				 int temp = array[i];
				 array[i] = array[j];
				 array[j] = temp;
			 }
			 else{
				 return j;
			 }
			 
		 }
		  
		  }
	 
	 public static String toString(int[] array) {
		  
		    String s = "[";
		    for (int i = 0; i < array.length; i++)
		      s += " " + array[i];
		    s += " ]";
		    return s;
		  }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] array = {4,5,3,7,2};
		
		//int[] array = {1,3,5,7,2,8,9,10};
		
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int[] array = new int[size];
		
		for(int i=0;i<size;i++){
			array[i] = in.nextInt();
			
		}
	    
	    System.out.println("Unsorted array: " + 
	                        QuickSort.toString(array));
	    
	    long start = System.nanoTime();	    
	    QuickSort.sort(array);
	    long end = System.nanoTime();
	    long duration = (end - start);
	    System.out.println("Quick Sort was completed in "+ duration+" nanoseconds");
	    
	    System.out.println("Sorted array:   " + 
	                        QuickSort.toString(array));
	}

}
