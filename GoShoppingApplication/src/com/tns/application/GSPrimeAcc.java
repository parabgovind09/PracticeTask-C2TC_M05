package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	
	private static final float charges = 0;
	
	public float getCharges() {
		return charges;
	}

	public GSPrimeAcc() {
		super(accNo, accNm, charges, isPrime);
	}
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}

	public void bookProduct(float charges) {
		if(isPrime) {
			System.out.println("Dear "+accNm+" Prime User, Your Product Charges Are: "+charges);
		}
		else {
			System.out.println("Dear "+accNm+" Our Normal User, Your Product Charges Are: "+charges+" With Delivery Charges is: "+NormalAcc.deliveryCharges+"\nTotal Charges = "+(charges+NormalAcc.deliveryCharges));
		}
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [getCharges()=" + getCharges() + ", isPrime()=" + isPrime() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
