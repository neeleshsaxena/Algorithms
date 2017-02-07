import java.util.Scanner;

public class HammingDistance {

	
	
/*public static int hammingDistance(int x, int y) {
    
	String binx = Integer.toBinaryString(x);
	String biny = Integer.toBinaryString(y);
	

		binx = String.format("%010d", Integer.parseInt(binx));
	
	
		biny = String.format("%010d", Integer.parseInt(biny));
		
	
	int counter =0;
	int flag = 0;
	int i =0;
	while(i<binx.length()){
		if(binx.charAt(i)!=biny.charAt(i)){
			counter++;
		}
		i++;
	}
	
	return counter;
    }*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		int a = Integer.bitCount(x ^ y);  //XOR
		
		

}
	}



/*
       XOR
0	0	0
0	1	1
1	0	1
1	1	0
*/