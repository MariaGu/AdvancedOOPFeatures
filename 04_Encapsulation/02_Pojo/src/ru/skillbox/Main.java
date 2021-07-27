package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Country russia = new Country("Russia");
        russia.setCapital("Moscow");
        russia.setIsNearSea(true);
        russia.setSquare(17130000);
        russia.setNumberOfCitizens(150000000);
        System.out.println(russia.getName());
        System.out.println(russia.getCapital());
        System.out.println(russia.getNumberOfCitizens());
        System.out.println(russia.getSquare());
        System.out.println(russia.getIsNearSea());
    }
}
