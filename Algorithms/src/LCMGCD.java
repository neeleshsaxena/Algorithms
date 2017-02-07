import java.util.Scanner;

public class LCMGCD {
	
	//link -> http://stackoverflow.com/questions/4201860/how-to-find-gcd-lcm-on-a-set-of-numbers
	
	//gcd for 2 numbers
	public static int gcd(int a, int b){
		
		while(b>0){
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
		
	}
	
	//gcd for an array of numbers
	public static int gcd(int[] nums){
		
		int result = nums[0];
		
		for(int i=1;i<nums.length;i++){
			result = gcd(result,nums[i]);
		}
		return result;
	}
	
	// 1. normal 
	public static int lcm(int a , int b){
		int max,min;
		max = (a>b)?a:b;
		min = (a<b)?a:b;
		int lcm=1;
			int x =0;
		for(int i=1;i<=min;i++){
			x= max*i;
			if(x%min==0){
				lcm = x;
				break;
			}
			
		}
		
		return lcm;
	}
	
		//2. lcm through gcd reduction
		public static int lcm2(int a, int b){
			return a * (b/gcd(a,b));
		}
		
	
		
		//lcm for an array of numbers
		public static int lcm(int[] nums){
			int result = nums[0];
			
			for(int i=1;i<nums.length;i++){
				result = lcm(result,nums[i]);
			}
			
			return result;
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		int result = lcm2(a,b);
		int result1 = gcd(a,b);*/
		
		int[] as = {16,96,34,24};
		int result1 = gcd(as);
		int result = lcm(as);
		System.out.println("LCM is "+ result);
		System.out.println("GCD is "+result1);
		
		
	}

}
