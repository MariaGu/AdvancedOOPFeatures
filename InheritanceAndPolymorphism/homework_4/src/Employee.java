public interface Employee {

    double getMonthSalary();

    public default double calculateSalary() {
        double minWage = 10_000;
        double maxWage = 100_000;
        double wage = minWage + Math.random() * maxWage;
        return wage;
    }
}
