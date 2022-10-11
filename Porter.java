import java.util.Random;

public class Porter extends Person{
    private int weight;
    private boolean free_porter = true;
    private String porter = "[Porter] ";

    public int getWeight() {
        return weight;
    }

    public boolean isFree_porter() {
        return free_porter;
    }

    public void setFree_porter(boolean free_porter) {
        this.free_porter = free_porter;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void speak(){
        System.out.printf("%sMy name is %s. And I will help you with your luggage", porter, male);
        System.out.println();
    }

    @Override
    public void bye(){
        System.out.printf("%sHave a nice vacation", porter);
        System.out.println();
    }

    public void bag(){
        Random random = new Random();
        weight = random.nextInt(50);
        System.out.printf("%sPlease, let us help you with the luggage", man);
        System.out.println();
        if(weight >= 30){
            free_porter = false;
            System.out.printf("%sIt seems like it's too heavy, please wait until one more porter comes", man);
            System.out.println();
            setReview(1);
        }
        else{
            System.out.printf("%sYour luggage will be carried to your room", man);
            System.out.println();
            setReview(1);
            setTips(5);
        }
    }

}
