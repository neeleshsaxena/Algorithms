import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JumpingNumbers {

	private static void bfs(int x, int i){
		
		Queue<Integer> q = new LinkedList<>();
		q.add(i);
		
		while(!q.isEmpty()){
			
			int val = q.poll();
			
			if(val<=x){
				
				System.out.print(val+" ");
				int lastDigit = val%10;
				
				if(lastDigit == 0){
					q.add(val*10 + lastDigit+1);
				}
				else if(lastDigit==9){
					q.add(val*10 + lastDigit-1);
				}
				else{
					q.add(val*10 + lastDigit-1);
					q.add(val*10 + lastDigit+1);
				}
				
				
				
			}
			
			
		}
		
		
		
	}
	
	
	//http://www.practice.geeksforgeeks.org/problem-page.php?pid=389
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sum = 5/2;
		//System.out.println(sum);
		
		
		
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		for(int j=0;j<num;j++){
			
			int x = in.nextInt();
			
			System.out.print(0+" ");
			for(int i=1;i<=9 && i<=x;i++){
			bfs(x, i);
			}
			
			
		}
		
	}

}
