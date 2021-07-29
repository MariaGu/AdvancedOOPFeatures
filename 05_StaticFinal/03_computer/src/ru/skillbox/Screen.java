package ru.skillbox;

public class Screen {
    private final double diagonal;
    private final TypeOfScreen typeOfScreen;
    private final int weight;

    public Screen(double diagonal, TypeOfScreen typeOfScreen, int weight) {
        this.diagonal = diagonal;
        this.typeOfScreen = typeOfScreen;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public TypeOfScreen getTypeOfScreen() {
        return typeOfScreen;
    }

    public int getWeight() {
        return weight;
    }

    public Screen setDiagonal(double diagonal) {
        return new Screen(diagonal, typeOfScreen, weight);
    }

    public Screen setTypeOfScreen(TypeOfScreen typeOfScreen) {
        return new Screen(diagonal, typeOfScreen, weight);
    }

    public Screen setWeight(int weight) {
        return new Screen(diagonal, typeOfScreen, weight);
    }

    public String toString(){
        return "Экран. Диагональ: " + getDiagonal() + ", Тип: " + getTypeOfScreen() + ", Вес: " + getWeight() + ".\n";
    }
}