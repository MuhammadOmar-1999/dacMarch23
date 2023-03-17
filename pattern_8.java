class pattern_8{
	public static void main(String args[]){
		int limit = 5;
		for(int i=0;i<5;i++){
			for(int j=4;j>i;j--){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print((limit-(i-k))+" ");
			}
			System.out.println();
		}
	}
}
/* 
	5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/