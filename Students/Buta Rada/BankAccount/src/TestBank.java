public class TestBank {
public static void main(String[] args) {
	//verificam cum functioneaza clasele create separat
	Account myAccount= new Account(10,0.0);
	SavingsAccount A2=new SavingsAccount(1,1000,0.3);
	A2.deposit(2000.50);
	System.out.println("Dupa o luna suma introdusa a devenit : \n"+	A2.calculateSumWithAnualInterestPerYear());
System.out.println("\n Dupa 5 luni  suma introdusa a devenit : \n");
double after5Months=0;
for(int i=0;i<5;i++)
	after5Months=A2.calculateSumWithAnualInterestPerYear();
System.out.println(" \n " + after5Months + "\n ");
	
	
   String a=myAccount.toString();
System.out.println(a);
	 myAccount.deposit(70.68);
	 System.out.println("Am introdus in cont suma de " + myAccount.getBalance());
	CurrentaAccount A1=new CurrentaAccount(1,0);
	A1.deposit(80.23);
	System.out.print(" \n Am introdus in contul A1 suma de " +  A1.getBalance());
	A1.withdrawOverdraft(40.89);
	System.out.print("\n Mai am in cont suma de  " +  A1.getBalance());
	A1.withdrawOverdraft(500.78);
	System.out.print("\n Mai am in cont suma de " +  A1.getBalance());
	A1.aflaStarea();
	A1.returnOverdraft(5000);
	A1.aflaStarea();
	//verificam clasa Bank
	Bank Bank1=new Bank();
	SavingsAccount S1=new SavingsAccount(1,1000,0.3);
	SavingsAccount S2=new SavingsAccount(2,300,0.5);
	SavingsAccount S3=new SavingsAccount(3,6700,0.2);
	SavingsAccount S4=new SavingsAccount(4,400,0.8);
	SavingsAccount S5=new SavingsAccount(5,1070,0.7);
	SavingsAccount S6=new SavingsAccount(6,8900,0.3);
	SavingsAccount S7=new SavingsAccount(7,2100,0.4);
	CurrentaAccount C1=new CurrentaAccount(8,200.17);
	CurrentaAccount C2=new CurrentaAccount(9,315.68);
	CurrentaAccount C3=new CurrentaAccount(10,999.99);
	CurrentaAccount C4=new CurrentaAccount(11,4000.09);
	CurrentaAccount C5=new CurrentaAccount(12,300.28);
	System.out.println(" Nr de conturi este : \n " + Bank1.getNrAccounts());
	Bank1.addSavingsAccount(S1);
	System.out.println(" Nr de conturi este : \n " + Bank1.getNrAccounts());
	Bank1.addSavingsAccount(S2);
	Bank1.addSavingsAccount(S3);
	Bank1.showAccounts();
	Bank1.addSavingsAccount(S4);
	Bank1.addSavingsAccount(S5);
	Bank1.addSavingsAccount(S6);
	Bank1.addSavingsAccount(S7);
	Bank1.addCurrentAccount(C1);
	Bank1.addCurrentAccount(C2);
	Bank1.addCurrentAccount(C3);
	Bank1.addCurrentAccount(C4);
	Bank1.addCurrentAccount(C5);
	Bank1.showAccounts();
	System.out.println(" Nr de conturi este : \n " + Bank1.getNrAccounts());
	Bank1.ShowCurrentAccounts();
	Bank1.ShowSavingsAccounts();
	
	
	
}  
}
