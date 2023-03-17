class pattern_13{
	public static void main(String args[]){
		int c=64;
		for(int i=1;i<=5;i++){
			for(int j=4;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print((char)(c+i)+" ");
			}
			System.out.println();
		}
	}
}
/*

   A
   B B
  C C C
 D D D D
E E E E E

*/