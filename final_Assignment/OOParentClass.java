package final_Assignment;

public class OOParentClass {
	private String fName;
	private String lName;
	private String BankID;	
	private double baseAmount;
	private int years;
	protected double interestRate;
	
	public OOParentClass(String fName,String lName,String BankID, int years,double baseAmount){ 
		// TODO Auto-generated constructor stub
		this.BankID=BankID;
		this.fName=fName;
		this.lName=lName;
		this.years=years;
		setBaseAmount(baseAmount);
	}
	
	public String getfName() {
		return fName;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public String getBankID() {
		return BankID;
	}
	public void setBankID(String bankID) {
		BankID = bankID;
	}

	public double getBaseAmount() {
		return baseAmount;
	}
	
	public void setBaseAmount(double baseAmount) {
		this.baseAmount = baseAmount;
	}
	
	public int getYears() {
		return years;
	}
	
	public void setYears(int years) {
		this.years = years;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

	

	
	
	
}
