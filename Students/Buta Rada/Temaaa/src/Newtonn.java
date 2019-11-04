import java.util.Scanner;

public class Newtonn {
	static double epsilon=0.001;
	static Scanner scann=new Scanner(System.in);
     static double xold,xnew;
	 static double function;
	 static double derivate;
	static  int iterations=0;

	 
	 static  double buildfunction(double x,double a,double b ,double c)
	 {
		 return  a*x*x+b*x+c; 
	  }
	  
	  
	   static double deriv(double x,double a , double b)
	 {
		 return a*2*x+b;
	 }
	 
	
	 
	  static void NewtonM(double x,double a,double b ,double c)
	 { function=buildfunction(x,a,b,c);
	  derivate=deriv(x,a,b);
	  xold=x;
	    xnew= xold-(function/derivate);
	    while(Math.abs(xnew-xold)>=epsilon) {
			 xold=xnew;
		 xnew= xold-function/derivate;
		 iterations++;
	 }
	 System.out.println("Numarul de iteratii este: "+iterations + ". \n" + "Solutia polinomului este : " +Math.round(x));
	 
	 }
	  public static void main(String[] args) {  
		  System.out.println("Coeficientii:");
		      double x0=1; 
		       int d =scann.nextInt();
			   int e = scann.nextInt();
			   int f= scann.nextInt();
		  NewtonM(x0,d,e,f);
		  System.out.println("Iteratii");
	  }
}
