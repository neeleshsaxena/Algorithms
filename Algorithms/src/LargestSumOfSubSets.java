import java.lang.instrument.Instrumentation;

public class LargestSumOfSubSets {

	public static int maxSum(int[] arr){
		
		int maxSoFar = 0;
		int maxEndHere =0;
		int first =0;
		int last =0;
		int s=0;
		
		for(int i=0;i<arr.length;i++){
			
			maxEndHere = maxEndHere + arr[i];
			
			if(maxEndHere < 0){
				maxEndHere = 0;
				s = i+1;
			}
			
			if(maxSoFar < maxEndHere){
				maxSoFar = maxEndHere;
				first = s;
				last = i;
			}
			
			
		}
		
		return maxSoFar;
	}
	
public static int maxSum1(int[] arr){
		
		int maxSoFar = 0;
		int maxEndHere =0;
		int first =0;
		int last =0;
		int s=0;
		
		for(int i=arr.length-1;i>=0;i--){
			
			maxEndHere = maxEndHere + arr[i];
			
			if(maxEndHere < 0){
				maxEndHere = 0;
				s = i+1;
			}
			
			if(maxSoFar < maxEndHere){
				maxSoFar = maxEndHere;
				first = s;
				last = i;
			}
			
			
		}
		
		return maxSoFar;
	}

	private static void find(int[] arr, int sum){
		
		
		int s=0;
		int max = Integer.MIN_VALUE;
		int val =0;
		int i=0;
		for(;i<arr.length;i++){
			
			val += arr[i];
			
			if(val>sum){
				i =s;
				s++;
				val=0;
			}
			
			if(val==sum){
				
				break;
			}
			
		}
		
		System.out.println(s+1);
		System.out.println(i+1);
		
	}
	
	public static int minSum(int[] arr){
		
		
		int minSoFar = 0;
		int minEndHere =0;
		int first =0;
		int last =0;
		int s=0;
		
		for(int i=0;i<arr.length;i++){
			
			minEndHere = minEndHere + arr[i];
			
			if(minEndHere > 0){
				minEndHere = 0;
				s = i+1;
			}
			
			if(minSoFar > minEndHere){
				minSoFar = minEndHere;
				first = s;
				last = i;
				
			}
			
			
		}
		
		return minSoFar;
	}
	
	public static int minSum1(int[] arr){
		
		
		int minSoFar = 0;
		int minEndHere =0;
		int first =0;
		int last =0;
		int s=0;
		
		for(int i=arr.length-1;i>=0;i--){
			
			minEndHere = minEndHere + arr[i];
			
			if(minEndHere > 0){
				minEndHere = 0;
				s = i+1;
			}
			
			if(minSoFar > minEndHere){
				minSoFar = minEndHere;
				first = s;
				last = i;
				
			}
			
			
		}
		
		return minSoFar;
	}
	
	//Kadane algorithm
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {-2,-3,4,-1,-2,1,5,-3};
		int[] arr = {778,-794,-387,650,-363,-691,-764,541,173,212,568,-783,863,-68,-930,23,70,-394,12,230,-422,-785,-199,316,414,92,957,-863,997,-306,-85,-337,-847,-314,-125,-583,-815,-435,44,88,277,789,404,-755,-933,677,740,227,95,-796,435,468,-98,318,653,302,287,-866,-445,-441,-32,-98,-482,-710,-568,498,-587,-307,-220,529,-733,-504,-271,709,-341,-797,-619,-847,-922,-380,765,842,194,35};
		int[] arr2 ={1,2,3,7,5};
		find(arr2, 12);
		int maxSum = maxSum(arr);
		int maxSum1 = maxSum1(arr);
		int minSum = minSum(arr);
		int minSum1 = minSum1(arr);
		System.out.println(maxSum1);
		System.out.println(minSum1);
		System.out.println(maxSum);
		System.out.println(minSum);
		//System.out.println(maxSoFar +" "+ first +" "+ last);
		
	}

}
