package b6;

public class Executive extends Employee {
    private double bonus;

    public Executive(String name, String address, String phone,
                     String ssn, double rate) {

        super(name, address, phone, ssn, rate);

        bonus = 0;
    }

    public void awardBonus(double execBonus) {
        bonus += execBonus;
    }

    @Override
    public double pay() {
        double payment = payRate + bonus;

        bonus = 0;

        return payment;
    }
}