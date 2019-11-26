
public class SavingsAccount extends Account {
private double annualInterest;
private double monthlyInterest;
 public SavingsAccount(int number, double balance,double a)
 {
	  super(number,balance);
	  this.annualInterest=a;
 }
 public void modifyAnnualVariable(double a)

  {
	  this.annualInterest=a;
	  
  }
 public double getVariable()
 {
	 return this.annualInterest;
 }
 
   public double calculateSumWithAnualInterestPerYear()
   {  
	    this.monthlyInterest=(this.balance*annualInterest)/12;
           this.balance+=this.monthlyInterest;
           return this.balance;
   }
  


}