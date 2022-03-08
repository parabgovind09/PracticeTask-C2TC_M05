package com.tns.framework;

public class PrimeAcc extends ShopAcc{

	public static boolean isPrime;
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.setPrime(isPrime);
	}

	public boolean isPrime() {
		return isPrime;
	}
	
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	
	public void bookProduct(float charges) {
		System.out.println("Charges are: "+charges);
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", isPrime()=" + isPrime() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}