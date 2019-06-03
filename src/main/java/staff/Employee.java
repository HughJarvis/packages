package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private Double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void raiseSalary(double increment){
        this.salary += increment;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }


}
