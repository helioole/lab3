import java.util.Random;

abstract class Hotel {
    public int review = 0;
    public int wallet;
//    public int tips;
    public int check = 70;
//    public int overall;

    public String feedback = "[REVIEW] ";
    public String cleaner = "[Cleaner] ";

    public String guest = "[Guest] ";
    public String man = "[Manager] ";
    public String opt = "[OPTION] ";
    public String bill = "[BILL] ";

    public int getCheck() {
        return check;
    }

    public void setReview(int review) {
        review ++;
    }

    public void setTips(int tips) {
        tips ++;
    }

    public void setCheck(int check) {
        check ++;
    }

    public void setWallet(int wallet) {
        if(wallet > 0){
            this.wallet = wallet;
        }
        else{
            System.out.print("Guest ran away without payment");
        }
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public Hotel(){
        Random random = new Random();
        this.wallet = random.nextInt(200);
    }

    public void welcome(){
        System.out.println("Welcome to our hotel!");
    }

    public void your_bill(){
        System.out.printf("%sYou have to pay %d dollars", bill, check);
        System.out.println();
    }


}

