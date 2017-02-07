import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IceCreamProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 Scanner in = new Scanner(System.in);
	        
	        int trips = in.nextInt();
	       
	        for(int i=0;i<trips;i++){
	        	 List<Integer> list = new ArrayList<>();
	            int money = in.nextInt();
	            int size = in.nextInt();
	            
	            int[] arr = new int[size];
	            
	            for(int j=0;j<size;j++){
	                arr[j] = in.nextInt();
	            }
	            
	            for(int k=0;k<arr.length;k++){
	                
	                for(int l=k+1;l<arr.length;l++){
	                    if(arr[k]+ arr[l]==money){
	                        list.add(k+1);
	                        list.add(l+1);
	                        break;
	                    }
	                    
	                }
	            }
	            
	            for(int num:list){
	                System.out.print(num + " ") ;
	            }
	            System.out.println(" ");
	        }
	}

}
