package ru.skillbox;

public class CPU {
    private final double frequency;
    private final int numberOfCores;
    private final String manufacturer;
    private final int weight;

    public CPU(double frequency, int numberOfCores, String manufacturer, int weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWeight() {
        return weight;
    }

    public CPU setFrequency(double frequency) {
        return new CPU(frequency, numberOfCores, manufacturer, weight);
    }

    public CPU setNumberOfCores(int numberOfCores) {
        return new CPU(frequency, numberOfCores, manufacturer, weight);
    }

    public CPU setManufacturer(String manufacturer) {
        return new CPU(frequency, numberOfCores, manufacturer, weight);
    }

    public CPU setWeight(int weight) {
        return new CPU(frequency, numberOfCores, manufacturer, weight);
    }

    public String toString(){
        return "Процессор. Частота: " + getFrequency() + ", Количество ядер: " + getNumberOfCores()
                + ", Производитель: " + getManufacturer() +  ", Вес: " + getWeight() + ".\n";
    }
}
