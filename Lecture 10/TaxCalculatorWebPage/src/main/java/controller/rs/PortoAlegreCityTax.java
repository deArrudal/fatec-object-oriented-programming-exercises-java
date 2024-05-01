package controller.rs;

import controller.ICityTaxStrategy;

public class PortoAlegreCityTax implements ICityTaxStrategy {
	float areaTotal;
	float areaGarage;

	public PortoAlegreCityTax() {
		super();
	}

	public void setAreaTotal(float areaTotal) {
		this.areaTotal = areaTotal;
	}

	public void setAreaGarage(float areaGarage) {
		this.areaGarage = areaGarage;
	}

	@Override
	public float computeTax() {
		if (areaGarage == 0) {
			return areaTotal * 8;
		}
		return areaTotal * 7.5f + areaGarage * 2.5f;
	}

}
