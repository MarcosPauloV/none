import java.util.ArrayList;

public class Departament {
    private int code;
    private String description;

    private final ArrayList<Officer> officers = new ArrayList<>();

    public Departament(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public boolean addOfficer(Officer officer) {
        officer.setDepartment(this);
        return officers.add(officer);
    }

    public void removeOfficer(int index) {
        Officer officer = officers.get(index);
        if(containsOfficer(officer)){
            officer.setDepartment(null);
            officers.remove(index);
        }
    }

    public boolean containsOfficer(Officer officer) {
        return officers.contains(officer);
    }

    public double totalWageCalculation(){
        double total = 0;
        for(Officer officer : officers){
            total += officer.salaryCalculaion();
        }
        return total;
    }

    public void comparOfficer(int index){
        if((officers.get(index)) instanceof OfficerMonthly){
            ((OfficerMonthly) officers.get(index)).getRegimeWorked();
        }
    }
}