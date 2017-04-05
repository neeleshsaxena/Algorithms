import java.util.Scanner;

public class InsertionSort {

	
	public static void sort(int[] A){
		
		
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
	       int s = in.nextInt();
	       int[] ar = new int[s];
	       
	       for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	       }
	       
	       long start = System.nanoTime();
	       sort(ar);
	       long end = System.nanoTime();
	       
	       long duration = (end-start);
	       
	       
	       
		System.out.println("The Insertion sort was completed in "+duration +" nanoseconds");
		printArray(ar);
	}

}
