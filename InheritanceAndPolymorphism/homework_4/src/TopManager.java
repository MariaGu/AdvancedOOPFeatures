public class TopManager implements Employee {

    private final double salary;
    private double percentOfBonus = 150;
    private Company company;


    public TopManager(Company company) {
        this.company = company;
        this.salary = calculateSalary();
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }

    @Override
    public double calculateSalary() {
        double minCompanyIncome = 10_000_000;
        double companyIncome = company.getIncome();
        double minWage = 10_000;
        double maxWage = 100_000;
        double wage = minWage + Math.random() * maxWage;
        double bonus = companyIncome > minCompanyIncome ? wage * 150 / 100 : 0;
        return wage + bonus;
    }
}
