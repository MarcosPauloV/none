public class OfficerMonthly extends Officer {
    private int regimeWorked;

    public OfficerMonthly(int code, String name, int registerNumber, int salary, int regimeWorked) {
        super(code, name, registerNumber, salary);
        this.regimeWorked = regimeWorked;
    }

    public int getRegimeWorked() {
        return regimeWorked;
    }

    public void setRegimeWorked(int regimeWorked) {
        this.regimeWorked = regimeWorked;
    }

    public double salaryCalculaion(){
        if(regimeWorked == 0) {
            salary = 2500;
        } else{
            salary = 1750;
        }
        return salary;
    }
}