
public class Bank  {
	
	  private Account[] BankAccounts=new Account[1000];
private  int  nrAccounts;
private int nrSavingsAccounts;
private int nrCurrentAccounts;

  public Bank()
  
  {
	  this.nrAccounts =0;
	this.nrSavingsAccounts=0;
	 this.nrCurrentAccounts=0;

  }


    public void addSavingsAccount(SavingsAccount A)
 {
	  BankAccounts[nrAccounts]=A;
	  nrAccounts=nrAccounts+1;
 }
	 public void addCurrentAccount(CurrentaAccount A)
		
		{
			BankAccounts[nrAccounts++]=A;
		}

		public int getNrAccounts()
		{
			return this.nrAccounts;
		}
		  public void showAccounts ()
		  {    System.out.println("Lista conturilor din banca : \n");
			  for(int i=0;i<nrAccounts;i++)
		     System.out.println(BankAccounts[i].toString());
			  
		  }
		  public void ShowSavingsAccounts()
		  {System.out.println("List SavingsAccounts: \n");
			  for(int i=0;i<nrAccounts;i++)
				  if(BankAccounts[i]instanceof SavingsAccount) {
					   nrSavingsAccounts++;
					   System.out.println( BankAccounts[i].toString());
					   
				  }
				System.out.println("Number of SavingsAccounts is : \n"+ nrSavingsAccounts);
			  
		  }
		  public void ShowCurrentAccounts()
		  { System.out.println("List Current Accounts: \n");
			  for(int i=0;i<nrAccounts;i++)
				  if(BankAccounts[i]instanceof CurrentaAccount) {
				 	   nrCurrentAccounts++;
					  System.out.println( BankAccounts[i].toString());
				  }
			System.out.println(" \n Number of CurrrentAccounts is : \n"+ nrCurrentAccounts);
			  
		  }
}
