
public class SubsetOfSetUsingBit {
	
	
	public static void findSets(char[] set){
		int size = set.length;			//001 is the pattern, and it should be moved left 3 places 
		for(int i=0;i<(1<<size);i++){  //1<<3 , so 0001<<3 = 01000, which is 8, so i should be less than 8. Which
				System.out.print("{");						// helps our case to find sets, as the number of sets that can be formed
			for(int j=0;j<size;j++){
					
				if((i & (1<<j)) > 0){
					System.out.print(set[j] + " ");								// with n values are 0 to 2^n -1 . for 3 there are 0-7 sets
				}
			}
			System.out.println("}");
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		char[] abc = {'a','b','c','d'};
		findSets(abc);
		
		int a = 24;
		int b = a&1;
		if((a&1)==1){
			System.out.println("odd");
		}else{
			System.out.println("even");
		}
		
	}

}
