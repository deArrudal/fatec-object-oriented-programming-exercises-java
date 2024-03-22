package model;

public class Mammal extends Animal {
    private String mammalFood;

    public Mammal() {
        setAnimalEnvironment("Land");
    }

    public String getMammalFood() {
        return mammalFood;
    }

    public void setMammalFood(String mammalFood) {
        this.mammalFood = mammalFood;
    }

    @Override
    public String printAnimalData() {
        return "Mammal [Name=" + getAnimalName() + ", Size=" + getAnimalSize() + "cm, NumberPaw="
                + getAnimalNumberPaw() + ", Color=" + getAnimalColor() + ", Speed=" + getAnimalSpeed()
                + "m/s, Food=" + mammalFood + "]";
    }
    
}
