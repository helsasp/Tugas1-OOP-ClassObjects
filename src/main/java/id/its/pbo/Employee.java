package id.its.pbo;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

   // konstruktor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }
    
    //setter first last name

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // getter - setter monthly salary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }
    
    //raise salary 10%
    public void raiseSalary(int percent) {
        if (percent > 0) {
            monthlySalary *= 1 + (percent / 100.00);
        }
    }

    //yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }
}

	//program
class EmployeeProgram {
    public static void main(String[] args) {
    	
    	//objects
        Employee employee1 = new Employee("Helsa", "Putri", 9500.75);
        Employee employee2 = new Employee("Harry", "Styles", 1000.50);

        employee1.raiseSalary(10);
        employee2.raiseSalary(10);

        System.out.println("Gaji Tahunan Employee 1 Setelah Kenaikan : " + employee1.getYearlySalary());
        System.out.println("Gaji Tahunan Employee 2 Setelah Kenaikan : " + employee2.getYearlySalary());
    }
}
