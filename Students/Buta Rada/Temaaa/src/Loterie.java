
import java.util.Scanner;
public class Loterie {
	public static void main (String[] args ) {
	Scanner scann= new Scanner(System.in);
	 System.out.println("Numarul sanselor de castig in cazul 6/49 este :  ");
	 int a=49;
	 int b=6;
	 long  sanse=1;
	 for(int i=1;i<=b;i++)
		 sanse=sanse*(a-i+1)/i;
	 System.out.println("\n " + sanse );
	 
}
}
