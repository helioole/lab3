import java.util.Random;

abstract class Guest {
    Random random = new Random();
    static int review = 0;
    public int wallet;
    static int tips = 0;
    static int spending = 0;
    public int weight;
    public boolean answer;
    public boolean enjoy;
    public int temperature;
    public String feedback = "[REVIEW] ";
    public String cleaner = "[Cleaner] ";
    public String guest = "[Guest] ";
    public String man = "[Manager] ";
    public static void setTips(int tips) {
        Guest.tips += tips;
    }

    public static void setSpending(int spending) {
        Guest.spending += spending;
    }

    public static void setReview(int review) {
        Guest.review += review;
    }

    public Guest(){
        this.weight = random.nextInt(60);
        this.answer =  random.nextBoolean();
        this.enjoy =  random.nextBoolean();
        this.temperature = random.nextInt(40);
    }
}