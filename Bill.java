import java.util.Random;

public class Bill extends Manager{
    Random random = new Random();
    public int payment = 0;
    private int tips;
//    private int warranty = 25;

    public int getPayment() {
        return payment;
    }
    public void setPayment(int payment) {
        this.payment = payment;
    }

    public void payBill(){
        tips = random.nextInt(50);
        payment += room_price;
        payment += tips;
//        payment += warranty;
        System.out.println("[Manager] THanks for visiting our hotel");
        System.out.printf("[BILL] You have to pay %d dollars", payment);
        System.out.println("");

        if(payment > wallet){
            System.out.println("Guest] Oh, I can't afford it");
            System.out.println("Guest ran away without paying...");
            System.exit(0);
        }
    }
}
