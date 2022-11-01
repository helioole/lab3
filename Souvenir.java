import java.util.Random;
import java.util.*;

public class Souvenir extends Services{
    Random random = new Random();
    private int index;

    private ArrayList<String> souv = new ArrayList<String>();
    private ArrayList<String> price1 = new ArrayList<String>();
    private String op1;
    private String op2;

    public void things() {

        souv.add("Pot");
        souv.add("Picture");
        souv.add("Statue");

        price1.add("18");
        price1.add("60");
        price1.add("35");

        System.out.println(souv);
        System.out.println(price1);

        String op1 = souv.get(random.nextInt(souv.size()));
        String op2 = price1.get(random.nextInt(price1.size()));

            System.out.println("[Client] I'll pick a " + op1 + " for " + op2 + " dollars");
            souv.clear();
            price1.clear();
            int picked = Integer.parseInt(op2);
            setSpending(picked);
    }
}
