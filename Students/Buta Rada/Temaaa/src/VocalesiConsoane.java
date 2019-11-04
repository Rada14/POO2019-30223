import java.util.Scanner;
public class VocalesiConsoane {
public static void main(String[] args)
{  
	  Scanner scann= new Scanner(System.in);
	   System.out.println("Scrieti enuntul: ");
	   String sir=scann.nextLine();
	   int cons=0, voc=0;
	   for(int i=0;i<sir.length();i++) {
		   char a=sir.charAt(i);
	    if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U' )
	    	voc=voc+1;
	    else
	    	if(a>64 && a<91 || a>96 &&a<123)
	    	cons=cons+1;
	   }
	   System.out.println("Nr de vocale este: " + voc + "\n Nr de consoane este: " + cons);
	    	
	}
}