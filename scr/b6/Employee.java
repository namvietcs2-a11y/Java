package b6;

public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String name, String address, String phone,
                    String ssn, double rate) {
        super(name, address, phone);

        this.socialSecurityNumber = ssn;
        this.payRate = rate;
    }

    @Override
    public double pay() {
        return payRate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSSN: " + socialSecurityNumber;
    }
}