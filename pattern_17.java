class pattern_17{
	public static void main(String args[]){
		int n=0;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				n++;
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
}
/*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/