public class Manager implements Employee {

    private final double salary;
    private double percentOfBonus = 5;

    public Manager() {
        salary = calculateSalary();
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }

    @Override
    public double calculateSalary() {

        double minAmountOfEarnMoney = 115_000;
        double maxAmountOfEarnMoney = 140_000;
        double amountOfEarnMoney = minAmountOfEarnMoney + Math.random() * maxAmountOfEarnMoney;

        double minWage = 10_000;
        double maxWage = 100_000;
        double wage = minWage + Math.random() * maxWage;

        return wage + percentOfBonus * amountOfEarnMoney / 100;
    }
}
