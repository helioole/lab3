import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int n = 365;
        int nrDays = 0;
            for(;;){
                for (int i = 1; i <= n; i++) {
                    int nrGuest = 0;
                    System.out.println();
                    System.out.printf("Day: %d", i);
                    System.out.println();

                    Porter porter = new Porter();
                    Accountant feedback = new Accountant();
                    Manager manager = new Manager();
                    Cleaning clean = new Cleaning();
                    Repair repair = new Repair();
                    Souvenir souvenir = new Souvenir();
                    Taxi taxi = new Taxi();
                    Medical medical = new Medical();

                    while (manager.available(porter) != 0 && clean.cleaningCheck(medical) != 0){
                        repair.repairProblems();
                        taxi.waiting(souvenir);
                        System.out.println();

                        nrGuest++;
                    }
                    System.out.println();
                    System.out.println("################################");
                    System.out.printf("Guests checked into room today: %d" + "\n", nrGuest);
                    feedback.giveTips();
                    feedback.giveFine();
                    feedback.giveFeedbackDay();
                    feedback.giveReview();
                    System.out.println("################################");
                    TimeUnit.SECONDS.sleep(1);
                }
            }
    }
}