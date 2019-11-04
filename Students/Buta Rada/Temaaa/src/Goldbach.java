import java.util.Scanner;
public class Goldbach {
	static boolean prime(int n)
	{ for(int i=2;i<=n/2;i++)
		if(n%i==0)
			return false;
	return true;
		
	}
	public static void main(String[] args)
	{    Scanner scann=new Scanner(System.in);
	   System.out.println("Alegeti intervalul:");
	     int n=scann.nextInt();
	     int m=scann.nextInt();
	    for (int i=n;i<=m;i++)
	    	for(int j=1;j<=i;j++)
	    		if(prime(j) && prime(i-j)) {
	    			int a= i-j;
	    			System.out.println("O suma de nr prime pentru " + i + " este : \n" + a +  "+" +j);
	    		}
	}

}
