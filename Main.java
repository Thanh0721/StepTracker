public class Main {
    public static void main(String[] args) {
        StepTracker tr = new StepTracker(10000);
        
        System.out.println("Active days: " + tr.activeDays()); // Expected: 0
        System.out.println("Average steps: " + tr.averageSteps()); // Expected: 0.0
        
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println("Average steps: " + tr.averageSteps()); // Expected: 7000.0
        
        tr.addDailySteps(13000);
        System.out.println("Active days: " + tr.activeDays()); // Expected: 1
        System.out.println("Average steps: " + tr.averageSteps()); // Expected: 9000.0
        
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println("Active days: " + tr.activeDays()); // Expected: 2
        System.out.println("Average steps: " + tr.averageSteps()); // Expected: 10222.2
    }
}