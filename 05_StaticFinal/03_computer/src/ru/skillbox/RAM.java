package ru.skillbox;

public class RAM {
    private final String type;
    private final int volume;
    private final int weight;

    public RAM(String type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }

    public RAM setType(String type) {
        return new RAM(type, volume, weight);
    }

    public RAM setVolume(int volume) {
        return new RAM(type, volume, weight);
    }

    public RAM setWeight(int weight) {
        return new RAM(type, volume, weight);
    }

    public String toString(){
        return "Оперативная память. Тип: " + getType() + ", Объем: " + getVolume() + ", Вес: " + getWeight() + ".\n";
    }
}
