class Employee {
    double calculateSalary() {
        return 0;
    }

    public static void main(String[] args) {

        partTimeEmployee p = new partTimeEmployee(2000, 30);
        partTimeEmployee p1 = new partTimeEmployee(3000, 30);
        fullTimeEmployee f = new fullTimeEmployee(200000);
        fullTimeEmployee f2 = new fullTimeEmployee(300000);

        System.out.println("Shamsu Sabo is Full Time Employee and his Salary is: " + f.calculateSalary());

        System.out.println("Umar Auwal Abdullahi is Part Time Lecturer and worked for 30 Hours at rate of 2000 per hour his Salary is: " + p.calculateSalary());

        System.out.println("Murtala Maigaranti is Full Time Lecturer and his Salary is: " + f2.calculateSalary());

        System.out.println("Aisha Buba is Part Time Lecturer and worked for 30 Hours at rate of 3000 per hour her Salary is: " + p1.calculateSalary());
    }
}

class fullTimeEmployee extends Employee {
    double monthlySalary;

    fullTimeEmployee(double salary) {
        this.monthlySalary = salary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class partTimeEmployee extends Employee {
    double hoursWorked;
    double ratePerHour;

    partTimeEmployee(double rate, double hours) {
        this.hoursWorked = hours;
        this.ratePerHour = rate;
    }

    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}