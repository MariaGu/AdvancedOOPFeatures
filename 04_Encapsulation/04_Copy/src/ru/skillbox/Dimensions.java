package ru.skillbox;

public class Dimensions {
    private final int length;
    private final int height;
    private final int width;

    public Dimensions(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public int calculateVolume() {
        return length * height * width;
    }
}
