
public class Palindrom{
	public static void main(String[] args)
	{   long nr;long aux;long  nr2=0;
		for(int i=999;i>=1;i--)
		for(int j=999;j>=1;j--) {
			int pal=1;
	        nr=i*j;
			aux=nr;
			while(aux>0)
			{ nr2=nr2*10+aux%10;
			  aux=aux/10;
			}
			if(nr!=nr2)
				pal=0;
			if(pal==1)
			{ System.out.println("Cel mai mare palindrom , fiind produs de 2 numere de 3 cifre este " + nr);
			    
			}
			}
			
	}

}
