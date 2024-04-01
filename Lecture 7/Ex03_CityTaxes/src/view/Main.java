package view;

import controller.*;

public class Main {
    public static void main(String[] args) {
        ICityTaxStrategy taxSP = new CityTaxSP(); // são paulo
        ICityTaxStrategy taxMG = new CityTaxMG(); // belo horizonte
        ICityTaxStrategy taxRS = new CityTaxRS(); // porto alegre
        ICityTaxStrategy taxPR = new CityTaxPR(); // curitiba

        System.out.printf("City: Sao Paulo - Tax: R$ %.2f\n", taxSP.computeTax());
        System.out.printf("City: Belo Horizonte - Tax: R$ %.2f\n", taxMG.computeTax());
        System.out.printf("City: Porto Alegre - Tax: R$ %.2f\n", taxRS.computeTax());
        System.out.printf("City: Curitiba - Tax: R$ %.2f\n", taxPR.computeTax());
    }
}