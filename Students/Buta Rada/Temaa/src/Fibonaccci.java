import java.util.Scanner;

class Fibbonaccci{
	static int fib(int n)
	{ int a=0,  b=1,  c;
	 if(n==0)
		 return a;
	    for(int i=2;i<=n;i++) {
	    	c=a+b;
	       a=b;
	       b=c;
	    }
	    return b;
	   
	}
	public static void main(String[] args)
	{ int i,sum=0;
		Scanner nr=new Scanner(System.in);
	System.out.println("Introduceti numarul");
	String numar=nr.nextLine();
	 int nrr;
	 nrr=Integer.parseInt(numar);
	 System.out.println("Numarul ales este  " + nrr);
	 System.out.println("fib(nr)= " +fib(nrr));
	 for(i=1;i<=nrr;i++) {
		 System.out.println(" "+  fib(i));
	    if(fib(i)%2==0)
	    	sum=sum+fib(i);
		 }
	 System.out.println("Suma termenilor pari este " + 
		 sum);
	}
}


