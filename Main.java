public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Cleaning clean = new Cleaning();
        Bill bill = new Bill();
        Porter porter = new Porter();
        Services services = new Services();
        Repair repair = new Repair();
        Souvenir souvenir = new Souvenir();
        Taxi taxi = new Taxi();
        Medical medical = new Medical();

        manager.speak();
        manager.available();
        manager.bye();
        porter.speak();
        porter.bag();
        porter.bye();
        clean.speak();
        clean.cleaningCheck();
        clean.bye();
        repair.repairProblems();
        medical.help();
        taxi.waiting();
        souvenir.things();
        bill.payBill();
        bill.feedback();
        bill.taxes();

    }
}