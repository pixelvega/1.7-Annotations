package level1.exercise1;

public class Main {
    public static void main(String[] args) {
        OnsiteWorker onsiteWorker = new OnsiteWorker("John", "Doe", 20);
        OnlineWorker onlineWorker = new OnlineWorker("Jane", "Smith", 20);

        System.out.println("Onsite Worker Salary: " + onsiteWorker.calcSalary(160));
        System.out.println("Online Worker Salary: " + onlineWorker.calcSalary(160));
    }
}
