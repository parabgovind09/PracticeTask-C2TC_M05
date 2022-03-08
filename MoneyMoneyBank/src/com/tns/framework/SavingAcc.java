package com.tns.framework;

import com.tns.application.MMSavingAcc;

public class SavingAcc extends BankAcc{
	
	private boolean isSalaried;
	private static final float MINBAL = MMSavingAcc.getMinbal();

	public SavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		super(AccNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	public boolean isSalaried() {
		return isSalaried;
	}

	public static float getMinbal() {
		return MMSavingAcc.getMinbal();
	}

	@Override
	public void withdraw(float withdrawmoney) {
		if(withdrawmoney < MINBAL) {
			System.out.println("You have "+getAccBal()+" money in your Saving Account");
			super.withdraw(withdrawmoney);
			System.out.println("You have "+(getAccBal()-withdrawmoney)+" money in your Saving Account");
		}
		else {
			System.out.println("Your Balance is less than Minimum Balance.\nYou cannot withdraw money");
		}
	}
	
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", isSalaried()=" + isSalaried() + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()="
				+ getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
