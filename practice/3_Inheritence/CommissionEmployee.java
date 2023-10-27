public class CommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String ssn;
    private double commissionRate;
    private double grossSales;

    // constructor
    public CommissionEmployee(String firstName, String lastName, String ssn, double commissionRate, double grossSales) {
        // explicit call to Object default construt
        super();
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >=0.0");
        }
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("commission rate must be greater than 0 and less than 1.0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getssn() {
        return ssn;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("gross sales must be greater than 0");
        }
        this.grossSales = grossSales;

    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setComissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("commission rate must be greater than 0 and less than 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    // earnings calculation
    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", ssn,
                "gross sales", grossSales,
                "commission rate", commissionRate);
    }
}
