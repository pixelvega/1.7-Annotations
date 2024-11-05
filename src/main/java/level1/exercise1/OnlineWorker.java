package level1.exercise1;

public class OnlineWorker extends Worker {
    public static final double INTERNET_FLAT_RATE = 30;

    public OnlineWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double calcSalary(int hoursWorked) {
        return (hoursWorked * pricePerHour) + INTERNET_FLAT_RATE;
    }
}