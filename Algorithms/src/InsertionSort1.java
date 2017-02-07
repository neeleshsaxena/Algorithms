import java.util.Scanner;

public class InsertionSort1 {
	


    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
    	int var = ar[ar.length-1];
        
    for(int i=ar.length-2;i>=0;i--){
        if(ar[i]>var){
            ar[i+1] = ar[i];
            printArray(ar);
        }else{
            ar[i+1] = var;
            printArray(ar);
            break;
        }
    }   
    
    //for the first element
    if(ar[0]>var){
    	ar[0]= var;
    	printArray(ar);
    }
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int[] ar = new int[s];
	         for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	         }
	         insertIntoSorted(ar);

	}

	
	 private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
}
