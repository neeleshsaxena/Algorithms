import java.util.Scanner;

public class SearchPairsHashing {
	private static final int MAX = 100000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        
	        int size = in.nextInt();
	        
	        int value = in.nextInt();
	        int[] arr = new int[size];
	        for(int i=0;i<size;i++){
	            arr[i] = in.nextInt();
	        }
	        
	        pairs(arr,value);
		
		
	}
	
	public static void pairs(int[] arr, int sum){
		
		 boolean[] binmap = new boolean[MAX];
		 
	        for (int i=0; i<arr.length; ++i)
	        {
	            int temp = sum-arr[i];
	 
	            // checking for condition
	            if (temp>=0 && binmap[temp])
	            {
	                System.out.println("Pair with given sum " +
	                                    sum + " is (" + arr[i] +
	                                    ", "+temp+")");
	            }
	            binmap[arr[i]] = true;
	        }
		
	}

}
