package b6;

public class Staff {
    private StaffMember[] staffList;

    public Staff() {

        staffList = new StaffMember[5];

        staffList[0] = new Executive(
                "Nguyen Van A",
                "Ha Noi",
                "0123456789",
                "111-11-1111",
                5000.0);

        staffList[1] = new Employee(
                "Tran Thi B",
                "Da Nang",
                "0987654321",
                "222-22-2222",
                3000.0);

        staffList[2] = new Hourly(
                "Le Van C",
                "HCM",
                "0333444555",
                "333-33-3333",
                100.0);

        staffList[3] = new Volunteer(
                "Pham Thi D",
                "Hue",
                "0777888999");

        staffList[4] = new Volunteer(
                "Hoang Van E",
                "Can Tho",
                "0666777888");

        ((Executive) staffList[0]).awardBonus(1000);
        ((Hourly) staffList[2]).addHours(40);
    }

    public void payday() {
        double amount;

        for (StaffMember staff : staffList) {

            System.out.println("---------------------------------");
            System.out.println(staff);

            amount = staff.pay();

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);
        }
    }
}