package controller.mg;

import controller.ICityTaxStrategy;

public class BeloHorizonteCityTax implements ICityTaxStrategy {
	float areaTotal;
	int bedroomNumber;

	public BeloHorizonteCityTax() {
		super();
	}

	public void setAreaTotal(float areaTotal) {
		this.areaTotal = areaTotal;
	}

	public void setBedroomNumber(int bedroomNumber) {
		this.bedroomNumber = bedroomNumber;
	}

	@Override
	public float computeTax() {
		return areaTotal * 7 + bedroomNumber * 4;
	}

}
