public abstract class BuilderOfficer {
    private int code;
    private String name;
    private int registerNumber;
    protected double salary;
    private Departament department;

    public BuilderOfficer code(int code){
        this.code = code;
        return this;
    }
    public BuilderOfficer name(String name){
        this.name = name;
        return this;
    }
    public BuilderOfficer registerNumber(int registerNumber){
        this.registerNumber = registerNumber;
        return this;
    }
    public BuilderOfficer salary(double salary){
        this.salary = salary;
        return this;
    }
    public BuilderOfficer Departament(Departament departament){
        this.department = departament;
        return this;
    }
}
