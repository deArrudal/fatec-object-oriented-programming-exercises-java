package model;

public class Magazine extends Exemplar {
    private String magazineISSN;

    public Magazine(int exemplarId, String exemplarName, int exemplarPages, String magazineISSN) {
        super(exemplarId, exemplarName, exemplarPages);
        this.magazineISSN = magazineISSN;
    }

    public String getMagazineISSN() {
        return magazineISSN;
    }

    public void setMagazineISSN(String magazineISSN) {
        this.magazineISSN = magazineISSN;
    }

    @Override
    public String toString() {
        return getExemplarId() + " - " + getExemplarName();
    }
}
