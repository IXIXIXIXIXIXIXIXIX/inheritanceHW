package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private Double salary;

    public Employee(String name, String niNumber, Double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(Double increase){
        if (increase > 0.0)
        {
            this.salary += increase;
        }
    }

    public Double payBonus(){
        return this.salary / 100.00;
    }

    public void changeName(String newName){

        if (newName != null && !newName.isEmpty())
        {
            this.name = newName;
        }
    }
}

