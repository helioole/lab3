import java.util.Random;

public class Guest {
    public int review = 0;
    public int wallet;
    public int check;
    public int tips = 5;

    public int getTips() {

        return tips;
    }

    public int getReview() {

        return review;
    }

    public void setReview(int review) {

        this.review = review;
    }

    public Guest(){
        Random random = new Random();
        this.wallet = random.nextInt(200);
    }

    public void welcome(){
        System.out.println("Welcome to our hotel!");
    }


}

