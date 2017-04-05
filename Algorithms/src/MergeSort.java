import java.util.Scanner;

public class MergeSort {
	private int[] array;
    private int[] tempMergArr;
    private int length;

    /*8
    1 3 5 7 2 8 9 10*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
		//int[] inputArr = {1,3,5,7,2,8,9,10};
		
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++){
			arr[i] = in.nextInt();
			
		}
        MergeSort mms = new MergeSort();
        
        long start = System.nanoTime();
        mms.sort(arr);
        long end = System.nanoTime();
        
        long duration = (end-start);
        
        System.out.println("Merge sort was completed in "+duration+" nanoseconds");
		printArray(arr);
        
        
    }
	
	private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
	
	public void sort(int[] arr){
		this.array = arr;
		this.length = arr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0,length-1);

		
	}

	
	public void doMergeSort(int lower, int higher){
		
		if(lower<higher){
			
			int mid = lower +(higher-lower)/2;
			
			doMergeSort(lower, mid);
			doMergeSort(mid+1, higher);
			mergeParts(lower,mid,higher);
		}
		
	}
	
	public void mergeParts(int lower,int mid,int higher){
		for(int i = lower;i<=higher;i++){
			tempMergArr[i] = array[i];
		}
		
		int i = lower;
		int j = mid+1;
		int k = lower;
		
		while(i<=mid && j<=higher){
			if(tempMergArr[i]<= tempMergArr[j]){
				array[k] = tempMergArr[i];
				i++;
			}else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid){
			array[k] = tempMergArr[i];
			i++;
			k++;
		}
		
	}
	
	
}
