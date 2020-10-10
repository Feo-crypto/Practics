package Practice7;

public class Operator implements EmployeePosition {
    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary) {
        double salary = baseSalary;
        return salary;
    }
}
