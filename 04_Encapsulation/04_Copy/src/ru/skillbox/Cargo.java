package ru.skillbox;

public class Cargo {
    private final Dimensions dimensions;
    private final int mass;
    private final String address;
    private final boolean isOkToSwitch;
    private final String registerNumber;
    private final boolean isFragile;

    public Cargo(Dimensions dimensions, int mass, String address, boolean isOkToSwitch, String registerNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.mass = mass;
        this.address = address;
        this.isOkToSwitch = isOkToSwitch;
        this.registerNumber = registerNumber;
        this.isFragile = isFragile;
    }

     public Cargo setAddress(String address){
        return new Cargo(dimensions, mass, address, isOkToSwitch, registerNumber, isFragile);
    }

    public Cargo setMass(int mass){
        return new Cargo(dimensions, mass, address, isOkToSwitch, registerNumber, isFragile);
    }

    public Cargo setDimensions(Dimensions dimensions){
        return new Cargo(dimensions, mass, address, isOkToSwitch, registerNumber, isFragile);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getMass() {
        return mass;
    }

    public String getAddress() {
        return address;
    }

    public boolean isOkToSwitch() {
        return isOkToSwitch;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public boolean isFragile() {
        return isFragile;
    }
}

