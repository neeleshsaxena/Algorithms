import java.util.Scanner;

public class BubbleSort {
	
	
	public static void sort(int[] arr){
		
		boolean switched = true;
		for(int j=0;j<arr.length-1 && switched==true;j++){
			switched = false;
			
			for(int k=0;k<arr.length-j-1;k++){
		
				if(arr[k]>arr[k+1]){
					switched = true;
					int temp = arr[k+1];
					arr[k+1] = arr[k];
					arr[k] = temp;
					
				}
				
			}
			
			
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
		
		int size = in.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++){
			arr[i] = in.nextInt();
			
		}
		
		long start = System.nanoTime();
		sort(arr);
		long end = System.nanoTime();
		
		long duration = (end - start);
		
		
		
		System.out.println("The Bubble sort was completed in "+duration+" nanoseconds");
		printArray(arr);
		
	}
}
