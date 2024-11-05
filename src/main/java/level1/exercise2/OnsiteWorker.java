package level1.exercise2;

public class OnsiteWorker extends Worker {
    public static double gasoline = 50;

    public OnsiteWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double calcSalary(int hoursWorked) {
        return (hoursWorked * pricePerHour) + gasoline;
    }

    @Deprecated
    public String calcAccFreeTime(int hoursWorked) {
        return "Deprecated: " + hoursWorked/8;
    }
}