import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KPairsWithSmallestSums {
	
	static class Tuple{
		int x;
		int y;
		public Tuple(int x,int y){
			this.x=x;
			this.y=y;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
KPairsWithSmallestSums ob = new KPairsWithSmallestSums();
		int[] nums1 = {1,7,11};
		int[] nums2 = {2,4,6};
		int k =3;
		List l = ob.kSmallestPairs(nums1, nums2, k);
		
		
	}
	
	
	public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
		Comparator<int[]> comp = new Comparator<int[]>(){

			@Override
			public int compare(int[] a, int[] b) {
				// TODO Auto-generated method stub
				if(a[0]+a[1]<b[0]+b[1]){
					return -1;
				}
				else if(a[0]+a[1]>b[0]+b[1]){
					return 1;
				}else {
					return 0;
				}
			}

		
			
		};
	
		
		PriorityQueue<int[]> pq = new PriorityQueue<>(comp);
		
		
		List<int[]> list = new ArrayList<>();
		if(nums1.length==0 || nums2.length==0 || k==0) return list;
		for(int i=0;i<nums1.length && i<k;i++){
			pq.add(new int[]{nums1[i],nums2[0],0});
		}
	
		
		 while(k-- > 0 && !pq.isEmpty()){
	            int[] cur = pq.poll();
	            list.add(new int[]{cur[0], cur[1]});
	            if(cur[2] == nums2.length-1) continue;
	            pq.offer(new int[]{cur[0],nums2[cur[2]+1], cur[2]+1});
	        }
		
		return list;
		
	}

	
	public List<int[]> convert(List<Tuple> list){
		List<int[]> list1 = new ArrayList<>();
		for(Tuple t:list){
			int[] ar = new int[2];
			ar[0] = t.x;
			ar[1] = t.y;
			list1.add(ar);
		}
		
		return list1;
	}
}


