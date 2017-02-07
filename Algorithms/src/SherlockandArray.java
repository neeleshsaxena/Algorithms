import java.util.Scanner;

public class SherlockandArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int q=0;q<num;q++){
			boolean flag = false;
			
			int size = in.nextInt();
			int[] arr = new int[size];
			
			for(int t=0;t<size;t++){
				arr[t] = in.nextInt();
			}
			
			
			for(int i=0;i<arr.length;i++){
				int sum=0;
				int sum1=0;
				
				//left
				for(int j=i-1;j>=0;j--){
					sum+=arr[j];
				}
				//right
				for(int k=i+1;k<arr.length;k++){
					sum1+=arr[k];
				}
				
				if(sum==sum1){
					System.out.println("YES");
					flag = true;
					break;
				}
				
			}
			if(!flag){
				System.out.println("NO");	
			}
			
			
		}
		

	}

}
