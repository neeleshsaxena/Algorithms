import java.util.PriorityQueue;
import java.util.Scanner;

public class KSmallestElementMatrix {


	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			int[][] mat = new int[][]{
				{1,5,9},
				{10,11,13},
				{12,13,15}
				
			};
		
			KSmallestElementMatrix ob = new KSmallestElementMatrix();
			int val = ob.kthSmallest(mat,8);
			System.out.println(val);
	}

	
	public int kthSmallest(int[][] mat, int k) {
	
	PriorityQueue<Tuple> pq = new PriorityQueue<>();
		
		int row = mat.length;
		
		for(int j=0;j<=row-1;j++){
			pq.add(new Tuple(0,j,mat[0][j]));
		}
		
		for(int i=0;i<k-1;i++){
			Tuple t = pq.poll();
			
			if(t.x == row-1){
				continue;
			}
			pq.offer(new Tuple(t.x+1,t.y,mat[t.x+1][t.y]));
			
		}
	
		return pq.poll().val;
		
	}
	
	
}

 class Tuple implements Comparable<Tuple>{

	int x;
	int y;
	int val;
	
	public Tuple(int x,int y,int val){
		this.x=x;
		this.y=y;
		this.val=val;
	}
	@Override
	public int compareTo(Tuple o) {
		// TODO Auto-generated method stub
		if(this.val<o.val){
			return -1;
		}else if(this.val>o.val){
			return 1;
		}else{
			return 0;
		}
	}
	
}
