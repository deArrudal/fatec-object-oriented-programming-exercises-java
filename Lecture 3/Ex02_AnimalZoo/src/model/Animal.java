package model;

public class Animal {
    private String animalName;
    private int animalSize;
    private int animalNumberPaw = 4;
    private String animalColor;
    private String animalEnvironment;
    private float animalSpeed; // [m/s]

    public Animal() {
        super();
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalSize() {
        return animalSize;
    }

    public void setAnimalSize(int animalSize) {
        this.animalSize = animalSize;
    }

    public int getAnimalNumberPaw() {
        return animalNumberPaw;
    }

    public void setAnimalNumberPaw(int animalNumberPaw) {
        this.animalNumberPaw = animalNumberPaw;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public String getAnimalEnvironment() {
        return animalEnvironment;
    }

    public void setAnimalEnvironment(String animalEnvironment) {
        this.animalEnvironment = animalEnvironment;
    }

    public float getAnimalSpeed() {
        return animalSpeed;
    }

    public void setAnimalSpeed(float animalSpeed) {
        this.animalSpeed = animalSpeed;
    }

    public String printAnimalData() {
        return "Animal [Name=" + animalName + ", Size=" + animalSize + "cm, NumberPaw="
                + animalNumberPaw + ", Color=" + animalColor + ", Speed=" + animalSpeed + "m/s]";
    }

}
