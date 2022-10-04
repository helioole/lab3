public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Clean clean = new Clean();
        Complaint complaint = new Complaint();
        Baggage baggage = new Baggage();
//        Services services = new Services();
        Unsatisfied unsatisfied = new Unsatisfied();
        Repair repair = new Repair();
        Bill bill = new Bill();
        Souvenir souvenir = new Souvenir();
        Taxi taxi = new Taxi();
        Medical medical = new Medical();

        manager.available();
        baggage.bag();
//        other.things();
//       feedback.feedbackCheck();
        clean.cleaningCheck();
        unsatisfied.unsatisfied_check();
        repair.repairProblems();
        medical.help();
        taxi.waiting();
        souvenir.things();
        bill.payBill();
        complaint.feedbackCheck();

    }
}