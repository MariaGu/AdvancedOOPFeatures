package ru.skillbox;

public class Country {
    private String name;
    private int numberOfCitizens;
    private int square;
    private String capital;
    private boolean isNearSea;

    public Country(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setNumberOfCitizens(int numberOfCitizens){
        this.numberOfCitizens = numberOfCitizens;
    }

    public int getNumberOfCitizens(){
        return numberOfCitizens;
    }

    public void setSquare(int square){
        this.square = square;
    }

    public int getSquare(){
        return square;
    }

    public void setCapital(String capital){
        this.capital = capital;
    }

    public String getCapital(){
        return capital;
    }
    public void setIsNearSea(boolean isNearSea){
        this.isNearSea = isNearSea;
    }

    public boolean getIsNearSea(){
        return isNearSea;
    }
}