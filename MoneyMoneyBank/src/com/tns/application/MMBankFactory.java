package com.tns.application;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.SavingAcc;

public class MMBankFactory implements BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc mmsa = new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
		return mmsa;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmca = new MMCurrentAcc(AccNo, accNm, accBal, accBal);
		return mmca;
	}
}
