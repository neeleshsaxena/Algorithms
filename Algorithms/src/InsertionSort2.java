import java.util.Scanner;

public class InsertionSort2 {
	 public static int insertionSortPart2(int[] A)
	    {       
	           // Fill up the code for the required logic here
	           // Manipulate the array as required
	           // The code for Input/Output is already provided
	        
	        /*correct code
	        for(int i =1;i<ar.length;i++){
	        	int j=i;
	           
	        	while(j>0 && ar[j]<ar[j-1]){
	        		int t = ar[j];
	        		ar[j] = ar[j-1];
	        		ar[j-1] = t;
	        		j--;
	        	}
	        	printArray(ar);
	            
	        }*/
		 int count =0;
		 //proper insertion sort
		 for(int i = 1; i < A.length; i++){
	            int value = A[i];
	            int j = i - 1;
	            while(j >= 0 && A[j] > value){
	                A[j + 1] = A[j];
	                j = j - 1;
	            }
	            A[j + 1] = value;
	            count++;
	        }

	        //printArray(A);
		 
		 
		 return count;
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	       int s = in.nextInt();
	       int[] ar = new int[s];
	       for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	       }
	      int count =  insertionSortPart2(ar);
	      System.out.println(count);
	}
	
	 private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
}
