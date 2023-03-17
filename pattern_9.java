class pattern_9{
	public static void main(String args[]){
		int c = 64;
		for(int i=1;i<=5;i++){
			for(int j=4;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print((char)(c+k)+" ");
			}
			System.out.println();
		}
	}
}
/*
   A
   A B
  A B C
 A B C D
A B C D E

*/