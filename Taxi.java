import java.util.Random;

public class Taxi extends Services{
    Random random = new Random();
    private int fair = 0;
    private int road = 0;
    private int sum = 0;
    public int minutes;
    public void waiting(Souvenir souvenir){
        check_trip();
        fair = random.nextInt(5);
        road = random.nextInt(5);
        sum = fair * road;
        System.out.println("[Guest] I need a taxi");
        if(trip) {
            setReview(1);
            minutes = random.nextInt(15);
            if (minutes == 0) {
                System.out.println("[Manager] Your taxi has arrived");
            } else {
                System.out.printf("[Manager] Taxi will arrive in %d minutes. Please wait" + "\n", minutes);
                System.out.printf("[Taxi driver] Taxi will cost " + sum + " dollars" + "\n");
                setReview(1);
                setSpending(sum);
            }
        }
        else{
            System.out.println("[Manager] There are no free cars");
            System.out.println("[Guest] I'll visit hotel's shop then");
            souvenir.things();
            setReview(1);
        }
    }
}
