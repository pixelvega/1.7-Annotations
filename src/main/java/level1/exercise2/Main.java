package level1.exercise2;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        OnsiteWorker onsiteWorker = new OnsiteWorker("John", "Doe", 20);
        OnlineWorker onlineWorker = new OnlineWorker("Jane", "Smith", 20);

        System.out.println("Onsite Worker Salary: " + onsiteWorker.calcSalary(160));
        System.out.println("Online Worker Salary: " + onlineWorker.calcSalary(160));

        System.out.println("OnsiteWorker Free Time: " + onsiteWorker.calcAccFreeTime(160));
        System.out.println("OnlineWorker Free Time: " + onlineWorker.calcAccFreeTime(160));

    }
}
