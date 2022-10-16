package week3.day1;

import cucumber.api.cli.Main;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("Axis Deposit");
	}
	public void BankInfodeposit()
	{
		super.deposit();
		this.deposit();
	}
	
	public static void main(String[] args) 
	{
		AxisBank axis=new AxisBank();
		System.out.println("1.BankDeposit from Bank Info Method 2.Axis Deposit Method- Confirm");
		axis.BankInfodeposit();
		System.out.println("Axis Deposit Method");
		axis.deposit();
		BankInfo bankinfo=new BankInfo();
		System.out.println("from Bank Info Method");
		bankinfo.deposit();
	}
}
