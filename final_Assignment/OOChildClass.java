package final_Assignment;

public class OOChildClass extends OOParentClass{
	private double rate;
	
	public OOChildClass(String fName,String lName,String BankID, int Years,double BaseAmount,double rate) {
		// TODO Auto-generated constructor stub
		super( fName, lName, BankID,Years,BaseAmount);
		setRate(rate);
		setInterestRate(interestRate);
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getInterestRate() {
		return super.getInterestRate();
	}
	public void setInterestRate(double interestRate) {
		this.interestRate=( getBaseAmount()*getRate()*getYears()) / 100;
	}
@Override
	public String toString() {
	// TODO Auto-generated method stub
	return String.format("Hello %s %s\nYour Account with Number=%s has saved over %d Year(s) the ammount of %f JD",getfName(),getlName(),getBankID(),getYears(),getInterestRate());
}

}
