class pattern_11{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int j=4;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			for(int l=1;l<i;l++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
*alternate method*:
for(int i=1,p=1; i<=9; i++,p++){
			for(int j=9;j>i;j--){
				System.out.print("  ");//decrement by two spaces per row starting with 16
			}
			for(int k=1;k<=p;k++){
				System.out.print("* ");
			}
			p++;//increment two stars per row starting with 1 in first.
			System.out.println();
		}
*/

/*

    *
   ***
  *****
 *******
*********

*/