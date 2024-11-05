package level1.exercise1;

public class OnsiteWorker extends Worker {
    public static double gasoline = 50;

    public OnsiteWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double calcSalary(int hoursWorked) {
        // Calcular el salario sumando la gasolina
        return (hoursWorked * pricePerHour) + gasoline;
    }
}