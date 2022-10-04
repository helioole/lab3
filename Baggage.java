import java.util.Random;

public class Baggage extends Manager {
    private int weight;
    private boolean free_porter = true;

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

    public void bag(){
        if(help) {
            weight = random.nextInt(50);
            if (weight >= 30) {
                free_porter = false;
                System.out.println("[Manager] It seems like it's too heavy, please wait until one more porter comes");
                review--;
            } else {
                System.out.println("[Manager] Your luggage will be carried to your room");
                review++;
                tips++;
            }
        }
    }
}
