package controller.sp;

import controller.ICityTaxStrategy;

public class SaoPauloCityTax implements ICityTaxStrategy {
	private float areaTotal;
	private int roomNumber;

	public SaoPauloCityTax() {
		super();
	}

	public void setAreaTotal(float areaTotal) {
		this.areaTotal = areaTotal;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public float computeTax() {
		return areaTotal * 10 + roomNumber * 2;
	}

}
