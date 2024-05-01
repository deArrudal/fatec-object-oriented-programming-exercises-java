package controller.pr;

import controller.ICityTaxStrategy;

public class ParanaCityTax implements ICityTaxStrategy {
	float areaTotal;
	int estateAge;

	public ParanaCityTax() {
		super();
	}

	public void setAreaTotal(float areaTotal) {
		this.areaTotal = areaTotal;
	}

	public void setEstateAge(int estateAge) {
		this.estateAge = estateAge;
	}

	@Override
	public float computeTax() {
		if (estateAge > 50) {
			return areaTotal * 5 + estateAge * 3;
		} else if (estateAge < 20) {
			return areaTotal * 5 + estateAge * 2;
		} else {
			return areaTotal * 5 + estateAge * 2.5f;
		}
	}

}
