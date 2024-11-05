package level1.exercise1;

public abstract class Worker {
    protected String name;
    protected String surname;
    protected double pricePerHour;

    public Worker(String name, String surname, double pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public abstract double calcSalary(int hoursWorked);
}
