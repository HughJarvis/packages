package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String niNumber, double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    @Override
    public double payBonus() {
        return super.getSalary() * 0.02;
    }
}
