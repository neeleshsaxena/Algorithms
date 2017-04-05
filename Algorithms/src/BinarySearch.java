
public class BinarySearch {
	
	//nlogn
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = i+1;
		}
		binarySearch(arr, 5);

	}
	
	public static void binarySearch(int[] arr, int data){
		int size = arr.length-1;
		
		int i =0;
		int j =size;
		boolean flag = false;
		int val =0;
		
		while(i<=j){
			int mid = i+(j-i)/2;
			
			if(arr[mid]==data){
				flag = true;
				val=data;
				break;
			}else if(arr[mid]>data){
				j = mid-1;
			}else if(arr[mid]<data){
				i = mid+1;
			}
			
			
		}
		if(flag){
			System.out.println("Found" + val);
		}
		else{
			System.out.println("Not found");
			
		}
		
	}

}
