import java.util.Scanner;

public class Staircase {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		for(int i=1;i<=size;i++){
			for(int j =1;j<=size;j++){
				
				if(i+j>size){
					System.out.print("#");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}
		
		/*for(int i=1;i<=size;i++){
			for(int j=1;j<=size;j++){
				
				if(i+j>size){
					System.out.print("#");
				}
				else{
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
			
		}*/
		
		
	}

}
//And if you remove the else part in the j loop, and just print #, we will have a waterfall model
//inverted staircase. start the loop from 0 and j<size
/*
for(int i=1;i<=size;i++){
	for(int j=0;j<size;j++){
		
		if(i+j>size){
			System.out.print(" ");
		}
		else{
			System.out.print("#");
		}
		
	}
	System.out.println(" ");
	
}*/
/*String a = in.next();
if(a.contains("PM")){
	System.out.println("");
}
String b = a.substring(0, 8);
String[] ab = b.split(":");
System.out.println(ab);
int size = in.nextInt();

for(int i=1;i<=size;i++){
	for(int j=1;j<=size;j++){
		
		if(i+j>size){
			System.out.print("#");
		}
		else{
			System.out.print(" ");
		}
		
	}
	System.out.println(" ");
	
}*/