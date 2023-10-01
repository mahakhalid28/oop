public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("maha", "khalid", 6000.0);
        Employee e2 = new Employee("maha", "khalid", 8000.0);
        e1.setmonSalary(e1.getmonSalary() * 0.1 + e1.getmonSalary());
        e2.setmonSalary(e2.getmonSalary() * 0.1 + e2.getmonSalary());
        System.out.println("e1 " + e1);
        System.out.println("e2 " + e2);

    }

}
