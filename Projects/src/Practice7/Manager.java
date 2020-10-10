package Practice7;

public class Manager implements EmployeePosition {

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        double compProfitsEarned=115000;
        /* compProfits 115 000 - 140 000 */



        double salary= baseSalary + 0.05 * compProfitsEarned;
        return salary;
    }
}
/* compProfits 115 000 - 140 000 */
