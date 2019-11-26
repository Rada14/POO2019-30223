
public class CurrentaAccount extends Account{
   private double overdraft;

   private double returnedOverdraft;
   int allow;
   
	public CurrentaAccount(int number,double balance)
	{
      super(number,balance);
    
      allow=1;
	}

public void returnOverdraft(double sum)
{
	this.returnedOverdraft=this.returnedOverdraft+sum;
	  if(this.returnedOverdraft>=5000)
	  {
		  this.returnedOverdraft=0;
		  allow=1;
	  }
}
 
  public double askOverdraft()
  {   if(allowedToGetOverdraft())
  {
	  this.overdraft=5000;
	  allow =0;
	  return this.overdraft;
  }
  else 
	  System.out.println("You can't ask for overdraft because you still have to return money to the bank!");
  return 0;
  }
  public void aflaStarea()
  {
	  if(this.returnedOverdraft==0 && allow==1)
		  System.out.println("\n Poti face un imprumut!");
	  else
		  System.out.println("\n Nu poti! ");
  }

  public boolean allowedToGetOverdraft()
  {
	  if(allow==0 )
		  return false;
	   return true;
  }

   public void withdrawOverdraft (double sumToConsume)
   
   {
	    if(this.balance>=sumToConsume)
	   this.balance=this.balance-sumToConsume;
	    else if(allowedToGetOverdraft())
	    	this.balance=this.balance+askOverdraft()-sumToConsume;
	    
 }
}
