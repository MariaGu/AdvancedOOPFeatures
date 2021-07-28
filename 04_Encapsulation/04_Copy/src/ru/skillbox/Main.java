package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Dimensions mashaDimensions = new Dimensions(5,8,3);
        Cargo mashaCargo = new Cargo(mashaDimensions, 25, "SPb", true,"858OQP", false);
        System.out.println(mashaDimensions.calculateVolume());
        Cargo pashaCargo = mashaCargo.setAddress("Moscow");
        System.out.println(mashaCargo.getAddress() + " " + mashaCargo.hashCode());
        System.out.println(pashaCargo.getAddress() + " " + pashaCargo.hashCode());
        Dimensions sashaDimensions = new Dimensions(8,100,8);
        Cargo sashaCargo = mashaCargo.setDimensions(sashaDimensions);
        System.out.println(mashaCargo.getDimensions() + " " + mashaCargo.hashCode());
        System.out.println(sashaCargo.getDimensions() + " " + mashaCargo.hashCode());
    }
}
