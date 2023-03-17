class pattern_10{
	public static void main(String args[]){
		int c = 69;
		for(int i=0;i<5;i++){
			for(int j=4;j>i;j--){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print((char)(c-(i-k))+" ");
			}
			System.out.println();
		}
	}
}
/*
    E
   D E
  C D E
 B C D E
A B C D E

*/