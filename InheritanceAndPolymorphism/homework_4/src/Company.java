import java.util.*;

public class Company {

    private List<Employee> workers = new ArrayList<>();
    private final double income = calculateIncome();

    public void hire(Employee employee) {
        workers.add(employee);
    }

    public void hireAll(List<Employee> employees) {
        workers.addAll(employees);
    }

    public void fire(Employee employee) {
        workers.remove(employee);
    }

    public void fireHalfWorkers() {
        for (int i = workers.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                continue;
            } else {
                workers.remove(workers.get(i));
            }
        }
    }

    public double getIncome() {
        return income;
    }

    private double calculateIncome() {
        double averageIncome = 20_000_000;
        return averageIncome * Math.random();
    }

    public List<Employee> getTopSalaryStaff(int count) {
        Comparator<Employee> compareBySalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.getMonthSalary(), e1.getMonthSalary());
            }
        };
        if (count < 0) {
            return null;
        } else if (count > workers.size()) {
            return getTopSalaryStaff(workers.size());
        } else {
            Collections.sort(workers, compareBySalary);
        }
        return workers.subList(0, count);
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        Comparator<Employee> compareBySalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.getMonthSalary(), e2.getMonthSalary());
            }
        };
        if (count < 0) {
            return null;
        } else if (count > workers.size()) {
            return getTopSalaryStaff(workers.size());
        } else {
            Collections.sort(workers, compareBySalary);
        }
        return workers.subList(0, count);
    }

    public void printTopEmployees() {
        System.out.println("Самые высокие зарплаты в компании:");

        for (Employee emp : this.getTopSalaryStaff(15)) {
            System.out.printf("%.0f руб.", emp.getMonthSalary());
            System.out.println();
        }

        System.out.println();
        System.out.println("Самые низкие зарплаты в компании");

        for (Employee emp : this.getLowestSalaryStaff(30)) {
            System.out.printf("%.0f руб.", emp.getMonthSalary());
            System.out.println();
        }

        System.out.println();
    }
}
