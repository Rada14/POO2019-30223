import java.math.BigInteger;

public class TablaSah{
	
	public static void main (String[] args)
	{
		 int a=64;
		 BigInteger b=new BigInteger("1");
		 BigInteger c=new BigInteger("2");
		 BigInteger rez=c.pow(a).subtract(b);
		 System.out.println(rez);
	}

}


