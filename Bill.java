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
        payment += check;
        payment += tips;
//        payment += warranty;
        System.out.printf("%sThanks for visiting our hotel", man);
        System.out.println();

        System.out.printf("%sYou have to pay %d dollars", bill, payment);
        System.out.println();

        if(payment > wallet){
            System.out.printf("%sOh, I can't afford it", guest);
            System.out.println();
            System.out.println("Guest ran away without paying...");
            System.exit(0);
        }
    }
}