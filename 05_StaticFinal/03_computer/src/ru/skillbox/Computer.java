package ru.skillbox;

public class Computer {
    private String vendor;
    private String name;
    public Keyboard keyboard;
    public Screen screen;
    public HardDisk hardDisk;
    public RAM ram;
    public CPU cpu;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalWeight() {
        return keyboard.getWeight() + screen.getWeight() + hardDisk.getWeight() + ram.getWeight() + cpu.getWeight();
    }

    public String toString() {
        // information about PC
        return "Компьютер:\n" + "Имя: " + getName() + ", Производитель: " + getVendor() +".\n"
                + cpu.toString()
                + ram.toString()
                + hardDisk.toString()
                + screen.toString()
                + keyboard.toString()
                + "Общий вес: " + getTotalWeight() + ".";
    }
}
