package Staff;

public abstract class Employee {

    private String name;
    private String numberNI;
    protected double salary;

    public Employee(String name, String numberNI, int salary) {
        this.name = name;
        this.numberNI = numberNI;
        this.salary = salary;
    }

    public void setName(String name) {
        if ( name != "" && name!= null)
        {this.name = name;}
    }

    public String getName() {
        return name;
    }

    public String getNumberNI() {
        return numberNI;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double salaryIncrease) {
        if (salaryIncrease > 0) {
            this.salary += salaryIncrease;
        }
    }

    public double payBonus(){
        return this.salary/100;
    }
}
