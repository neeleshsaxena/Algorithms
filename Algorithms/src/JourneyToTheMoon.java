import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/journey-to-the-moon/forum
public class JourneyToTheMoon {

	
	
	private int[] parent;
	private int[] rank;
	private Map<Integer,Integer> map;
	
	
public  JourneyToTheMoon(int n){
		
		parent = new int[n];
		rank = new int[n];
		map = new HashMap<>();
		
		for(int i=0;i<n;i++){
			parent[i] = i;
			map.put(i, 1);
		}
		
		
		
	}
	
	private int find(int i){
	
	if(parent[i]!= i){
		
		parent[i] = find(parent[i]);
		
		
	}
	
	return parent[i];
	
	}
	
private void union(int i,int j){
		
		int xRoot = find(i);
		int yRoot = find(j);
		
		if(xRoot!= yRoot){
			
			if(rank[xRoot]>rank[yRoot]){
				parent[yRoot] = xRoot;
				map.replace(xRoot, map.get(xRoot) + map.get(yRoot));
				map.remove(yRoot);
				
			}
			
			else if(rank[xRoot]<rank[yRoot]){
				parent[xRoot] = yRoot;
				map.replace(yRoot, map.get(yRoot) + map.get(xRoot));
				map.remove(xRoot);
				
			}
			else{
				//assign any
				parent[yRoot] = xRoot;
				
				rank[xRoot] = rank[xRoot] +1;
				
				map.replace(xRoot, map.get(xRoot) + map.get(yRoot));
				map.remove(yRoot);
				
			}
			
		}
		
		
	}

	private long findCombinations(){
		//old answer + the sum of old values x new value.
		
		long sum = 0;
		long ans =0;
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			
			int key = (int)it.next();
			int val = map.get(key);
			if(sum ==0){
				sum = val;
				
			}else{
				ans = ans + sum * val;
				sum += val;
			}
			
			
			
			
		}
		
		
		
		return ans;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		int lines = in.nextInt();
		
		JourneyToTheMoon jm = new JourneyToTheMoon(size);
		
		for(int i=0;i<lines;i++){
			
			jm.union(in.nextInt(), in.nextInt());
			
			
			
		}
		
		
		long val = jm.findCombinations();
		System.out.println(val);
		
	}
	
	
	
	

}
