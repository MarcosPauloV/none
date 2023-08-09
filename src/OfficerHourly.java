public class OfficerHourly extends Officer {
    private double hoursWorked;
    private  double valuePerHour;

    public OfficerHourly(int code, String name, int registerNumber, int salary, double hoursWorked, double valuePerHour) {
        super(code, name, registerNumber, salary);
        this.hoursWorked = hoursWorked;
        this.valuePerHour = valuePerHour;
    }

    @Override
    public double salaryCalculaion() {
        salary = valuePerHour * hoursWorked;
        return salary;
    }
}