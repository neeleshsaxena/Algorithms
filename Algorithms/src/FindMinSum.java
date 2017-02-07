import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMinSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		
		List<Integer> list = new ArrayList<>();
		//int sum = in.nextInt();
		
		for(int a=0;a<size;a++){
			
			list.add(in.nextInt());
		}	
		
		//sort the array first
		list.sort(null);
		
		int i =0;
		int j =list.size()-1;
		int positiveMax = Integer.MAX_VALUE-2;
		int negativeMin = Integer.MIN_VALUE+2;
		while(i<j){
			
			int temp = list.get(i) + list.get(j);
			
			if(temp>0){
				if(temp<positiveMax){
					positiveMax = temp;
				}
				j--;
			}
			else if(temp<0){
				if(temp>negativeMin){
					negativeMin = temp;
				}
				i++;
			}
			else{
				System.out.println("their sum is 0" +list.get(i) + " ," + list.get(j));
			}
			
		}
		
		if(Math.abs(negativeMin)>positiveMax){
			System.out.println(positiveMax);
		}else{
			System.out.println(negativeMin);
		}
	}

}
