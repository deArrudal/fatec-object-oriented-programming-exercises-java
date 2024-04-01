package controller;

import javax.swing.JOptionPane;

public class CityTaxRS implements ICityTaxStrategy {
    @Override
    public float computeTax() {
        float areaTotal = Float.parseFloat(JOptionPane.showInputDialog(null, "Total area [m^2]:"));
        float areaGarage = Float.parseFloat(JOptionPane.showInputDialog(null, "Garage area [m^2]:"));
        if (areaGarage == 0) {
            return areaTotal * 8;
        }
        return areaTotal * 7.5f + areaGarage * 2.5f;
    }

}
