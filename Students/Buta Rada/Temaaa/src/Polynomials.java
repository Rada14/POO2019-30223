import java.util.Scanner;
import java.io.File;

class Polynomials {
	
	
		
	static int maximum(int a ,int b)
	{if(a>b)
		return a;
	return b;
	}
	
	static int[] multiplysc(int v[],int b,int sc)
	{   
		for(int i=0;i<b;i++)
		{  
			v[i]=v[i]*sc;
		}
		return v;
	
	}
	static int[] multiply(int v[], int w[], int a, int b)
	{ int mul[]= new int[a+b -1];
	 for (int i =0; i<a+b-1;i++)
		  mul[i]=0;
		 for(int i=0;i<a;i++) {
			 for(int j=0;j<b;j++) {
				 mul[i+j]=mul[i+j]+ v[i] * w[j];
			 }
		 }
		 return mul;
		  
	}


	static int[] subb(int v[],int w[],int a,int b)
	{
		int size=maximum( a, b);
	    int sub[]=new int [size];
	    for (int i=0;i<size;i++)
	    	sub[i]=v[i];
	    for(int i=0;i<b;i++)
	    	sub[i]=sub[i]-w[i];
	    return sub;
	}

	static int[] add( int v[],int w[],int a,int b)
	{ int size=maximum(a,b);
	  int s[]=new int [size];
	  for(int i=0;i<a;i++)
	  {  s[i]=v[i];
	  }
	  for(int i=0;i<b;i++)
	  { s[i] +=w[i];
	 
	}
	  return s;
}
	static int evaluate(int v[],int a,int n)
	{int rez=v[0];int i;int x=1;
		 for( i=1;i<a;i++) {
			  x=n;
		  for(int k=0;k<i;k++)
			  x = x*n;
		  rez=rez+v[i]* x;
		 }
		  return rez;
		 
	}
			  
			  
			  
		 
		 
	
	
	
	static void print(int a[],int n)
	{ for(int j=0;j<n;j++) {
		System.out.print(a[j]);
		if(j>0) {
			System.out.print(" x^ "+j);
	}
		if(j!=n-1) {
			System.out.print(" + ");
		}
		
	}
	System.out.println(" \n");
	}
	
	
public static void main(String[] args) throws Exception{
	
		  /*File f = new File("C:\\Users\\Rada-Puiu\\eclipse-workspace\\Tema_@\\Tema_partea2\\src");
		  
		  Scanner scann=new Scanner(f);
		  String s=scann.nextLine();
		  String[] a1=s.split(" ");
		  int l1=a1.length;
		  int b1[]=new int[l1];
		  for(int i=0;i<l1;i++)
		  {
			  b1[i]=Integer.parseInt(a1[i]);
			  System.out.print(a1[i]+" ");
		  
	 }
		  s=scann.nextLine();
	   String[] a2=s.split(" ");
	   int l2=a2.length;
	   int b2[]=new int[l2];
	   for(int i=0;i<l2;i++)
	   {
		   b2[i]=Integer.parseInt(a2[i]);
		   System.out.print(a2[i]+ " ");
	   }*/
	   
	   
	int V[]= {1,2,3,4,5};
	int W[]= {6,7,8};
	int n=V.length;
	int m=W.length;
	System.out.println("\n Primul polinom este: \n");
	print(V,n);
	System.out.println(" \n Al doilea polinom este: \n");
	print(W,m);
	int sum[]=add(V,W,n,m);
	int subb[]=subb(V,W,n,m);
	int size=maximum(n,m);
	System.out.println("\n Suma este: \n");
	print(sum,size);
	System.out.println("\n Rezultatul scaderii este : \n");
	print(subb,size);
	System.out.println(" \n Rezultatul inmultirii cu un scalar este : \n");
	int sc1[]=multiplysc(V,n,5);
	int sc2[]=multiplysc(W,m,3);
	 print(sc1,n);
	 print(sc2,m);
	 System.out.println(" \n");
	System.out.println(" \n Rezultatul inmultirii polinoamelor date este : \n");
	 int mult[]=multiply(V,W,n,m);
	 int y=mult.length;
	 print(mult,y);
  System.out.println(" \n ");
  int result=evaluate(V,n,1);
  System.out.println(" \n Evaluarea pt nr "+  " este : "+  result  + "\n");
  }
}


