package com.tns.framework;

public class NormalAcc extends ShopAcc{
	
	public static float deliveryCharges=50;
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		NormalAcc.deliveryCharges=deliveryCharges;
	}

	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	
	public void bookProduct(float charges) {
		System.out.println("Charges are: "+charges);
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", getDeliveryCharges()=" + getDeliveryCharges()
				+ ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getCharges()=" + getCharges() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}	
	
}