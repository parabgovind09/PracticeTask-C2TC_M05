package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}
	
	public GSNormalAcc() {
		super(accNo, accNm, deliveryCharges, deliveryCharges);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [getDeliveryCharges()=" + getDeliveryCharges() + ", toString()=" + super.toString()
				+ ", getCharges()=" + getCharges() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	public void bookProduct(float charges) {
		System.out.println("Dear "+accNm+" Our Normal User, Your Product Charges Are: "+charges+" With Delivery Charges is: "+deliveryCharges+"\nTotal Charges = "+(charges+NormalAcc.deliveryCharges));
	}

}
