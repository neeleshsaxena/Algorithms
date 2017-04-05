import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryStringGoogle {
	
	
	private static void combinations(String str){
		
		Queue<StringBuilder> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder(str);
		q.add(sb);
		
		while(!q.isEmpty()){
			
			StringBuilder st = q.poll();
			int index = st.indexOf("?");
			
			if(index!=-1){
			
				StringBuilder st0 = new StringBuilder(st);
				st0.setCharAt(index, '0');
				q.add(st0);
				
				st.setCharAt(index, '1');
				q.add(st);
				
				
			}
			else{
				
				System.out.print(st+" ");
			}
			
		
			
		}
		
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		for(int i=0;i<num;i++){
			
			String st = in.next();
			
			combinations(st);
			
			
		}
		
	}

}
