import java.util.ArrayList;
import java.util.Random;

public class Unsatisfied extends Check {
    final ArrayList<String> meals = new ArrayList<String>();
    final ArrayList<String> drinks = new ArrayList<String>();
    private String choice1;
    private String choice2;

    public void createMeals() {
        meals.add("Pizza");
        meals.add("Carbonara");
        meals.add("Burger");

        System.out.println(meals);

        drinks.add("Coca Cola");
        drinks.add("Sprite");
        drinks.add("Juice");

        System.out.println(drinks);

        Random random = new Random();
        String choice1 = meals.get(random.nextInt(meals.size()));
        String choice2 = drinks.get(random.nextInt(drinks.size()));
        System.out.println("[Guest] I'll order " + choice1 + " and " + choice2);
    }
    public void unsatisfied_check() {
        check_answer();
        check_cleaned();
        if (!isCleaned) {
            System.out.println("[Guest] But I don't really like this room");
//            cleaning_review--;
            System.out.println("[Manager] Oh, we're so sorry. We can make order you food as an apology");
            System.out.println("[Manager] Will you accept it?");

            if (answer) {
                System.out.println("[Guest] Fine, i'll accept it");
//                cleaning_review++;
//                tips++;
                createMeals();
            } else{
                System.out.println("[Guest] No! It's unacceptable. I'm leaving");
//            review -= 5;
//            tips++;
                System.out.println("Client left the hotel ..");
                System.exit(0);
            }
        }
    }
    }
