import java.util.Scanner;

public class NumberComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int mask = Integer.highestOneBit(num<<1)-1;
		 num = ~num;
		 
		 System.out.println(num&mask);
		
		
	}

}
