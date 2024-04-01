package controller;

import javax.swing.JOptionPane;

public class CityTaxMG implements ICityTaxStrategy {
    @Override
    public float computeTax() {
        float areaTotal = Float.parseFloat(JOptionPane.showInputDialog(null, "Total area [m^2]:"));
        int bedroomNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Number of bedrooms:"));
        return areaTotal * 7 + bedroomNumber * 4;
    }

}
