import java.util.Scanner;
import java.util.Stack;

public class CheckParanthesisStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		
		int num = in.nextInt();
		
		for(int i=0;i<num;i++){
			String string = in.next();
			
			Stack<Character> stack = new Stack<>();
			int count =0;
			int max = Integer.MIN_VALUE;
			for(int j=0;j<string.length();j++){
				
				if(string.charAt(j)=='(' && !stack.isEmpty() && stack.peek().equals('(')){
					stack.push(string.charAt(j));
					count=0;
				}else if(string.charAt(j)=='('){
					stack.push(string.charAt(j));
				}
				else if(string.charAt(j)==')'  && !stack.isEmpty() && stack.peek().equals('(')){
					stack.pop();
					count+=2;
					if(count>max){
						max=count;
					}
				}
				
				
			}
			System.out.println( max);
		}
		
	}

}
