package ru.skillbox;

public class HardDisk {
    private final double amountOfMemory;
    private final TypeOfHardDisk typeOfHardDisk;
    private final int weight;

    public HardDisk(double amountOfMemory, TypeOfHardDisk typeOfHardDisk, int weight) {
        this.amountOfMemory = amountOfMemory;
        this.typeOfHardDisk = typeOfHardDisk;
        this.weight = weight;
    }

    public double getAmountOfMemory() {
        return amountOfMemory;
    }

    public TypeOfHardDisk getTypeOfHardDisk() {
        return typeOfHardDisk;
    }

    public int getWeight() {
        return weight;
    }

    public HardDisk setAmountOfMemory(double amountOfMemory) {
        return new HardDisk(amountOfMemory, typeOfHardDisk, weight);
    }

    public HardDisk setTypeOfHardDisk(TypeOfHardDisk typeOfHardDisk) {
        return new HardDisk(amountOfMemory, typeOfHardDisk, weight);
    }

    public HardDisk setWeight(int weight) {
        return new HardDisk(amountOfMemory, typeOfHardDisk, weight);
    }

    public String toString(){
        return "Жесткий диск. Тип: " + getTypeOfHardDisk() + ", Объем памяти: " + getAmountOfMemory() + ", Вес: " + getWeight() + ".\n";
    }
}
