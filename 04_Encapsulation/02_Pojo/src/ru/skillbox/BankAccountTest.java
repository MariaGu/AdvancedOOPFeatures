package ru.skillbox;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount mashaAccount = new BankAccount(854854L, "Masha" );
        mashaAccount.setAmountOfMoney(1000000);
        mashaAccount.setInRubles(false);
        mashaAccount.setNameOfOwners("Grisha");
        System.out.println(mashaAccount.getAmountOfMoney());
        System.out.println(mashaAccount.getNameOfOwners());
        System.out.println(mashaAccount.getNumber());
        System.out.println(mashaAccount.isInRubles());
    }
}
