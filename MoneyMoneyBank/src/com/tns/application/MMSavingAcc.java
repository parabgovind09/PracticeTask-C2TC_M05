package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	
	private static final float MINBAL = 1000;

	public MMSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		super(AccNo, accNm, accBal, isSalaried);
	}
	
	@Override
	public void withdraw(float withdrawmoney) {
		System.out.println("Dear "+getAccNm()+" you want to withdraw : "+withdrawmoney);
		if(withdrawmoney < MINBAL) {
			System.out.println("Minimum Balance to withdraw money from your Saving Account is "+MINBAL);
			System.out.println("Your Saving Account Balance is more than Minimum Balance.\nYou can withdraw money");
			super.withdraw(withdrawmoney);
			System.out.println("Trascation is Successful");
		}
		else {
			System.out.println("Your Balance is less than Minimum Balance.\nYou cannot withdraw money");
		}
	}
	
	
	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried()=" + isSalaried() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

	public static float getMinbal() {
		return MINBAL;
	}

	public static void main(String[] args) {
		
	}

}
