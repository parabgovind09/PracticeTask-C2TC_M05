package com.tns.framework;

public abstract interface BankFactory {
	public abstract SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit);
}
