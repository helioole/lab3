import java.util.ArrayList;
import java.util.Random;

public class Repair extends Services{
    Random random = new Random();
    private ArrayList<String> stuff = new ArrayList<String>();
    private ArrayList<String> price = new ArrayList<String>();
    private String rep1;
    private String rep2;

    public void repairProblems(){
        check_before();
        check_isBroken();

        stuff.add("TV");
        stuff.add("bed");
        stuff.add("Fridge");

        price.add("45");
        price.add("50");
        price.add("70");

        System.out.println(stuff);
        System.out.println(price);

        String rep1 = stuff.get(random.nextInt(stuff.size()));
        String rep2 = price.get(random.nextInt(stuff.size()));
        stuff.clear();
        price.clear();

        if(isBroken){
            System.out.println("[Guest] Oh, there is " + rep1 + " broken");
            if(before){
                System.out.println("[Manager] Oh, we'll replace it immediately");
                setReview(1);
            }
            else{
                System.out.println("[Manager] We check each of our rooms before guest's arriving");
                System.out.print("[Manager] Unfortunately, you'll have to pay for it " + rep2 + " dollars" + "\n");
                int result = Integer.parseInt(rep2);
                setSpending(result);
                setReview(-7);
            }
        }
    }
}
