import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RearrangeAdjacentChars {
	
	static class PQ {
		
		char c;
		int count;
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		
		
		Comparator<PQ> comp = new Comparator<PQ>(){
			
			@Override
			public int compare(PQ one, PQ two){
				
				if(one.count>two.count){
					return -1;
				}
				else if(two.count>one.count){
					return 1;
				}else{
					return 0;
				}
				
			}
			
		};
		
		PriorityQueue<PQ> pq = new PriorityQueue<>(comp);
		
		int[] count = new int[26];
		for(int i=0;i<str.length();i++){
			count[str.charAt(i) - 'a']++;
		}
		
		for(char i='a';i<'z';i++){
			if(count[i -'a'] > 0){
				PQ p = new PQ();
				p.c = i;
				p.count = count[i -'a'];
				
				pq.add(p);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		PQ prev = new PQ();
		prev.c = '#';
		prev.count = -1;
		
		while(!pq.isEmpty()){
			
			//add the max priority char to the result string
			PQ top = pq.poll();
			sb.append(top.c);
			
			//if prev count is >0, then add the char back to the queue
			if(prev.count>0){
				pq.add(prev);
			}
			
			
			top.count--;
			prev = top;
			
			
			
		}
		
		
		
		
		if(sb.length()==str.length()){
			System.out.println(sb);
		}
		else{
			System.out.println("Not Possible");
		}

	}

}
