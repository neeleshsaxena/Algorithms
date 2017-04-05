import java.util.Scanner;

public class SelectionSort {
	
	
	public static void sort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {

			int large = arr[i];
			int index = i;

			for (int j = 0; j <= i; j++) {

				if (arr[j] > large) {
					large = arr[j];
					index = j;
				}

			}

			arr[index] = arr[i];
			arr[i] = large;

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
		
		
		
		System.out.println("The Selection sort was completed in "+duration+" nanoseconds");
		printArray(arr);

	}

}
