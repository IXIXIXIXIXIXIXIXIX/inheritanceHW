package staff.management;

public class Director extends Manager{

    private Double budget;

    public Director(String name, String niNumber, Double salary, String deptName, Double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public Double payBonus() {
        return super.payBonus() * 2;
    }
}
