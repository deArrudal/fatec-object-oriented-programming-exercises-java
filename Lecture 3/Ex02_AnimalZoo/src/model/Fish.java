package model;

public class Fish extends Animal {
    private String fishFeature;

    public Fish() {
        setAnimalNumberPaw(0);
        setAnimalColor("Gray");
        setAnimalEnvironment("Sea");
        fishFeature = "{Fins, Tail}";
    }

    public String getFishFeature() {
        return fishFeature;
    }

    public void setFishFeature(String fishFeature) {
        this.fishFeature = fishFeature;
    }

    @Override
    public String printAnimalData() {
        return "Fish [Name=" + getAnimalName() + ", Size=" + getAnimalSize() + "cm, NumberPaw="
                + getAnimalNumberPaw() + ", Color=" + getAnimalColor() + ", Speed=" + getAnimalSpeed()
                + "m/s, Feature=" + fishFeature + "]";
    }

}
