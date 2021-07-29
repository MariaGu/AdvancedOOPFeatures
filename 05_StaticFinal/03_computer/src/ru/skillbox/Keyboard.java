package ru.skillbox;

public class Keyboard {
    private final String type;
    private final boolean isHasIllumination;
    private final int weight;

    public Keyboard(String type, boolean isHasIllumination, int weight) {
        this.type = type;
        this.isHasIllumination = isHasIllumination;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public boolean isHasIllumination() {
        return isHasIllumination;
    }

    public int getWeight() {
        return weight;
    }
    public Keyboard setType(String type) {
        return new Keyboard(type, isHasIllumination, weight);
    }

    public Keyboard SetIsHasIllumination(boolean isHasIllumination) {
        return new Keyboard(type, isHasIllumination, weight);
    }

    public Keyboard SetWeight(int weight) {
        return new Keyboard(type, isHasIllumination, weight);
    }

    public String toString(){
        return "Клавиатура. Тип: " + getType() + ", Наличие подсветки: " + isHasIllumination() + ", Вес: " + getWeight() + ".\n";
    }
}

