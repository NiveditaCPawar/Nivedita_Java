package start_Pattern;

public class Equilateral_Download {

	public static void main(String[] args) {
//		*******
//  	 *****		row-->4,1st row star-->7, space-->0
//		  ***
//		   *
		 int star=7;
		 int space=0;
		 for(int i=1;i<=4;i++) {
			 for(int j=1;j<=space;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=star;k++) 
			 {
				 System.out.print("*");
			 } 
			 System.out.println();
			 star=star-2;
			 space++;
		 }
		
	}

}
