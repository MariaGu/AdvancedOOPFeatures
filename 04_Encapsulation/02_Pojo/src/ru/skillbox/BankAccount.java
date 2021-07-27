package ru.skillbox;

public class BankAccount {
    private long number; // too much characters for integer in number of bank account
    private String nameOfOwners;
    private int amountOfMoney;
    private boolean isInRubles;

    BankAccount(long number, String nameOfOwners){
        this.number = number;
        this.nameOfOwners = nameOfOwners;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getNameOfOwners() {
        return nameOfOwners;
    }

    public void setNameOfOwners(String nameOfOwners) {
        this.nameOfOwners = nameOfOwners;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public boolean isInRubles() {
        return isInRubles;
    }

    public void setInRubles(boolean inRubles) {
        isInRubles = inRubles;
    }

}
