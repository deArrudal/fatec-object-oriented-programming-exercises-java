package controller;

import javax.swing.JOptionPane;

public class CityTaxPR implements ICityTaxStrategy {
    @Override
    public float computeTax() {
        float areaTotal = Float.parseFloat(JOptionPane.showInputDialog(null, "Total area [m^2]:"));
        int estateAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Estate age:"));
        if (estateAge > 50) {
            return areaTotal * 5 + estateAge * 3;
        } else if (estateAge < 20) {
            return areaTotal * 5 + estateAge * 2;
        } else {
            return areaTotal * 5 + estateAge * 2.5f;
        }
    }

}
