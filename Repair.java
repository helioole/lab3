import java.util.ArrayList;
import java.util.Random;

public class Repair extends Services{
    private ArrayList<String> stuff = new ArrayList<String>();
    private String rep;


    public void repairProblems(){
        check_before();
        check_isBroken();

        stuff.add("TV");
        stuff.add("bed");
        stuff.add("Fridge");

        String rep = stuff.get(random.nextInt(stuff.size()));

        if(isBroken){
            System.out.println("[Guest] Oh, there is " + rep + " broken");
            if(before){
                System.out.println("[Manager] Oh, we'll replace it immediately");
            }
            else{
                System.out.println("[Manager] We check each of our rooms before guest's arriving");
                System.out.println("[Manager] Unfortunately, you'll have to pay for it");
            }
        }
    }
}
