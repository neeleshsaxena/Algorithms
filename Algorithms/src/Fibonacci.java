import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Fibonacci {
	
	
	public static int fib(int n){
		if(n ==0 || n==1){
			return 1;
		}
		
		else{
			return fib(n-1) + fib(n-2);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		
		BigInteger t1 = new BigInteger(in.nextInt()+"");
	    BigInteger t2 = new BigInteger(in.nextInt()+"");
	    int n = in.nextInt();

	    BigInteger temp = new BigInteger("0");
	    for(int i=3;i<=n;i++){
	        temp = t2;
	        t2 = t2.multiply(t2);
	        t2 = t2.add(t1);
	        t1 = temp;
	    }
	    System.out.println(t2);
		
		
	    
	    
	    
		
	}

}
