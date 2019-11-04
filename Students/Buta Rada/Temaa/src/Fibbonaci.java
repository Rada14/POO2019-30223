import java.util.Scanner;
class Fibbonacci {
	static int fib(int n)
	
	{
	   if(n<=1)
	   return n;
  return fib(n-1)+fib(n-2);
	    }
	public static void main(String[] args)
	{ int i,sum=0;
		Scanner nr=new Scanner(System.in);
	System.out.println("Introduceti numarul");
	String numar=nr.nextLine();
	 int nrr;
	 nrr=Integer.parseInt(numar);
	 System.out.println("Numarul ales este  " + nrr);
	 System.out.println("fib(7)= " +fib(nrr));
	 for(i=1;i<=nrr;i++) {
		 System.out.println(" "+  fib(i));
	    if(fib(i)%2==0)
	    	sum=sum+fib(i);
		 }
	 System.out.println("Suma termenilor pari este " + 
		 sum);
	}
}


