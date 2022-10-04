import java.util.Random;

public class Taxi extends Services{
    Random random = new Random();
    public int minutes;

    public void waiting(){
        check_trip();
        if(trip) {
            System.out.println("[Guest] I need a taxi");
            minutes = random.nextInt(15);
            if (minutes == 0) {
                System.out.println("[Manager] Your taxi has arrived");
            } else {
                System.out.printf("[Manager] Taxi will arrive in %d minutes. Please wait", minutes);
                System.out.println("");
            }
        }
    }
}
