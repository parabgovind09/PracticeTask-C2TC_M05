package com.tns.framework;

public abstract class BankAcc {
	
	private int accNo;
	private String accNm;
	private float accBal;
	
	public BankAcc(int AccNo, String accNm, float accBal) {
	    super();
		this.accNo = AccNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	public void withdraw(float widthdrawmoney) {
		System.out.println("Widthdraw Amount "+widthdrawmoney+" is deducted from your Account");
	}
	
	public void deposite(float accBal) {
		System.out.println("This is deposite method from bank account"+accBal);
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}
	
}
