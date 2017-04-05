import java.util.Scanner;

public class InsertionAndQuick {
	
	public static void insertionSort(int[] A){
		
		
		for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
          
        }
		
	}
	
	private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
	
	
	public static void quickSort(int[] array) {
	    
		  Qsort(array, 0, array.length-1);
		  }

	 public static void Qsort(int[] array, int first, int last) {
			
		 if(first<last){
			 
			 int mid = partition(array, first, last);
			 
			 Qsort(array, first, mid);
			 Qsort(array, mid + 1, last);
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
	 
	  public static void shuffle(int[] a) {
	        int n = a.length;
	        for (int i = 0; i < n; i++) {
	            // choose index uniformly in [0, i]
	            int r = (int) (Math.random() * (i + 1));
	            int swap = a[r];
	            a[r] = a[i];
	            a[i] = swap;
	        }
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int[] insertArr = new int[size];
		int[] quickArr = new int[size];
		
		for(int i=0;i<size;i++){
			insertArr[i] = in.nextInt();
			
		}
		
		System.arraycopy(insertArr, 0, quickArr, 0, size);
		
		
		//if(size < 5000){
			
			shuffle(quickArr);
			printArray(quickArr);
			long startQuick = System.nanoTime();
			quickSort(quickArr);
			long endQuick = System.nanoTime();
			long durationQuick = (endQuick - startQuick);
			System.out.println("Quick sort was completed in "+durationQuick+" nanoseconds");
			printArray(quickArr);
			
			
		//}
		//else{
			
			shuffle(insertArr);
			printArray(insertArr);
			long start = System.nanoTime();
			insertionSort(insertArr);
			long end = System.nanoTime();
			long duration = (end - start);
			
			System.out.println("The Insertion sort was completed in "+duration+" nanoseconds");
			printArray(insertArr);
			
		//}
		
		
		
		
	}

}
