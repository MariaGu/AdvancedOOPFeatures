import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static final String STAFF_TXT = "C:\\Users\\SuperUser\\Desktop\\java_basics\\AdvancedOOPFeatures\\homework_1\\data\\staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println("Unordered list");
        printListEmployee(staff);
        System.out.println("______________________________");
        System.out.println("Ordered list");
        sortBySalaryAndAlphabet(staff);
        printListEmployee(staff);

    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {

        Collections.sort(staff, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
    }

    public static void printListEmployee(List<Employee> list) {
        list.forEach(System.out::println);
    }
}