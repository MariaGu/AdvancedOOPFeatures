public class CompanyTest {
    public static void main(String[] args) {

        Company DHL = createCompany();
        DHL.printTopEmployees();
        DHL.fireHalfWorkers();
        DHL.printTopEmployees();
    }

    public static Company createCompany() {
        Company company = new Company();
        for (int i = 0; i < 180; i++) {
            company.hire(new Operator());
        }
        for (int i = 0; i < 80; i++) {
            company.hire(new Manager());
        }
        for (int i = 0; i < 10; i++) {
            company.hire(new TopManager(company));
        }
        return company;
    }
}
