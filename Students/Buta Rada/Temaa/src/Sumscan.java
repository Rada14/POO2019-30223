import java.util.Scanner;
public class Sumscan {
	public static void main(String[] args)
	{ Scanner a=new Scanner(System.in);
	 System.out.println("ENTER THE NUMBER \n");
	  String b=a.nextLine();
	  System.out.print("Nr ales este  "+ b);
	  int c=Integer.parseInt(b);
	    int i;
	    int sum=0;
	    for(i=1;i<=c;i++)
	    	if(i%3==0 ||i%5==0)
	    		sum=sum+i;
	    System.out.println(" \n Suma este  " + sum);
	    		
	}	

}
/* an overflow will occur for a number larger than a 32-bit number
 *  and for a long variable , for a number lrger than 64-bit number */

