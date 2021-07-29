package ru.skillbox;

public class ComputerTest {

    public static void main(String[] args) {
        Computer mashaComputer = new Computer("Russia", "MashaPC");
        mashaComputer.screen = new Screen(15.8, TypeOfScreen.TN, 200);
        mashaComputer.keyboard = new Keyboard("usual", true, 100);
        mashaComputer.hardDisk = new HardDisk(250.0, TypeOfHardDisk.HDD, 250);
        mashaComputer.ram = new RAM("usual", 250, 50);
        mashaComputer.cpu = new CPU(3.14, 2, "Company", 120);
        System.out.println(mashaComputer.getTotalWeight());
        System.out.println(mashaComputer.toString());
    }
}
