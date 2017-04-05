import java.util.Scanner;

public class AbsoluteMaxDiff {

	
	
public static int maxSum(int[] arr){
        
        int maxSoFar =Integer.MIN_VALUE;
        int maxEndHere =0;
        
        for(int i=0;i<arr.length;i++){
            
            maxEndHere = maxEndHere + arr[i];
            
            if(maxEndHere<0){
                maxEndHere =0;
            }
            
            if(maxEndHere>maxSoFar){
                maxSoFar = maxEndHere;
            }
            
        }
        
        
        return maxSoFar;
    }
    
    public static int minSum(int[] arr){
        
        int minSoFar =Integer.MAX_VALUE;
        int minEndHere =0;
        
        for(int i=0;i<arr.length;i++){
            
            minEndHere = minEndHere + arr[i];
            
            if(minEndHere>0){
                minEndHere =0;
            }
            
            if(minEndHere<minSoFar){
                minSoFar = minEndHere;
            }
            
        }
        
        
        return minSoFar;
    }
	
	//http://www.practice.geeksforgeeks.org/problem-page.php?pid=1656
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		for(int h=0;h<num;h++){
		      
		    int size = in.nextInt();
		    int[] arr = new int[size];
		    
		    for(int r=0;r<size;r++){
		        arr[r] = in.nextInt();
		        
		    }
		    
		  
		  int max = maxSum(arr);
		  int min = minSum(arr);
		  
		 
		   int val = Math.abs(max - min);
		   System.out.println(val);
		}
		
		
	}
	

}
