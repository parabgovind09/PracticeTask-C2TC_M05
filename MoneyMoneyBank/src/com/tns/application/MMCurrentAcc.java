package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	float sum;

	public MMCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		super(AccNo, accNm, accBal, creditLimit);
	}

	@Override
	public void withdraw(float withdrawmoney) {
		System.out.println("Dear "+getAccNm()+" you want to withdraw : "+withdrawmoney);
		sum = getCreditLimit() + withdrawmoney;
		if(getAccBal() > sum) {
			System.out.println("Minimum Balance to withdraw money from your Current Account is"+sum);
			super.withdraw(withdrawmoney);
			System.out.println("Trascation is Successful");
		}
		else {
			System.out.println("Your Balance is less than Withdraw Money Ammount.\nYou cannot withdraw money");
		}
	}
	
	@Override
	public String toString() {
		return "MMCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
