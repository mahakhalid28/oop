public class Employee {
    private String firstName;
    private String lastName;
    private double monSalary;

    public Employee(String firstName, String lastName, double monSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monSalary >= 0)
            this.monSalary = monSalary;

    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getfirstName() {
        return firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;

    }

    public String getlastName() {
        return lastName;
    }

    public void setmonSalary(double monSalary) {
        if (monSalary >= 0)
            this.monSalary = monSalary;

    }

    public double getmonSalary() {
        return monSalary;
    }

    public String toString() {
        return String.format("%s %s %f", firstName, lastName, monSalary);
    }

}