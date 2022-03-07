public class Operator implements Employee {

    private final double salary;

    public Operator() {
        this.salary = calculateSalary();
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}
