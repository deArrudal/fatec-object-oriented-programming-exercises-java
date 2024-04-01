package controller;

import javax.swing.JOptionPane;

public class CityTaxSP implements ICityTaxStrategy {
    @Override
    public float computeTax() {
        float areaTotal = Float.parseFloat(JOptionPane.showInputDialog(null, "Total area [m^2]:"));
        int roomNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Number of rooms:"));
        return areaTotal * 10 + roomNumber * 2;
    }

}
