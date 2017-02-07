import java.util.Scanner;

public class BubbleSort {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++){
			arr[i] = in.nextInt();
			
		}
		
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
		
		
		System.out.println("the sorted array");
	}

}
