
public class TVMatrix {

	
	public static char[][] mat;
	
	
	
	static class curr{
		char ch;
		int left;
		int right;
		int i,j;
	}

	
	
	public static void print(char c,curr current,int i,int j){
		
		if(c>current.right){
			System.out.println("Down");
			current.i  = current.i+1;
			current.ch = mat[current.i][j];
			current.left = current.left+5;
			current.right = current.right+5;
			print(c, current,current.i,j);
			return;
		}
		
		if(c<current.left){
			System.out.println("Up");
			current.i = current.i -1;
			current.ch = mat[current.i][j];
			current.left = current.left-5;
			current.right = current.right-5;
			print(c, current,current.i,j);
			return;
		}
		
		
		else if(c>=current.left && c<=current.right){
			
			if(c>current.ch){
				System.out.println("Right");
				current.j = current.j+1;
				current.ch = mat[i][current.j];
				print(c, current,i,current.j);
				return;
				
			}
			else if(c<current.ch){
				System.out.println("Left");
				current.j = current.j-1;
				current.ch = mat[i][current.j];
				print(c, current,i,current.j);
				return;
			}
			else if(c==current.ch){
				System.out.println("Enter");
				return;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 mat = new char[][]{
			{'a','b','c','d','e'},
			{'f','g','h','i','j'},
			{'k','l','m','n','o'},
			{'p','q','r','s','t'},
			{'u','v','w','x','y'},
			{'z'}
		};
		
		String st = "movie";
		
		curr c = new curr();
		c.ch='a';
		c.left=97;
		c.right=101;
		c.i=0;
		c.j=0;
		
		for(int i=0;i<st.length();i++){
			print(st.charAt(i),c,c.i,c.j);
		}
		
	}

}
