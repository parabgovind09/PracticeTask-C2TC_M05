package com.tns.framework;

public abstract class CurrentAcc extends BankAcc{
	
	private final float creditLimit=2000;
	float sum;

	public CurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		super(AccNo, accNm, accBal);
	}

	public float getCreditLimit() {
		return creditLimit;
	}

	@Override
	public void withdraw(float withdrawmoney) {
		sum = creditLimit + withdrawmoney;
		if(getAccBal() > sum) {
			System.out.println("Your Current Account Balance is more than Minimum Balance.\nYou can withdraw money");
			super.withdraw(withdrawmoney);
			System.out.println("You have "+(getAccBal()-withdrawmoney)+" money in your Current Account");
		}
		else {
			System.out.println("Your Balance is less than Withdraw Money Ammount.\nYou cannot withdraw money");
		}
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()="
				+ getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
