package Practice7;

public class TopManager implements EmployeePosition {
    @Override
    public String getJobTitle() {
        return "Top Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        double salary;
        double compProfits = TheCompany.getCompProfits();
        if (compProfits>=10000000) {
            salary = baseSalary + 1.5 * baseSalary;
        }
        else{ salary=baseSalary;}
        return salary;
    }
}
