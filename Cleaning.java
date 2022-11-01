import java.util.ArrayList;
import java.util.Random;

public class Cleaning extends Person {
    public Medical medical;
    private boolean isCleaned;
    private ArrayList<String> meals = new ArrayList<String>();
    private ArrayList<String> drinks = new ArrayList<String>();
    private String choice1;
    private String choice2;

    @Override
    public void speak() {
        System.out.printf("%sMy name is %s. The room is prepared for you", cleaner, call);
        System.out.println();
    }

    @Override
    public void reply() {
        System.out.printf("%sWe'll work on quality of our service", cleaner);
        System.out.println();
    }
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
        meals.clear();
        drinks.clear();
    }

    public int cleaningCheck(Medical medical) {
        speak();
        Random random = new Random();
        isCleaned = random.nextBoolean();
        if (isCleaned) {
            System.out.println("[Guest] The room is so clean");
            review++;
            setTips(7);
            return 1;
        } else {
            System.out.println("[Guest] The room is so dirty. Such a bad hotel");
            setReview(-5);
            setFine(10);
            reply();
            System.out.println("[Manager] We're so sorry. We could order you food as an apology");
            System.out.println("[Manager] Would you accept it?");
            if (answer) {
                System.out.println("[Guest] Fine, i'll except it");
                setReview(1);
                setTips(1);
                createMeals();
                System.out.println("[Manager] Did you enjoy your meal?");
                if(enjoy){
                    System.out.println("[Guest] Yeah, thank you");
                    return 1;
                }
                else{
                    medical.help();
                    setReview(-10);
                    setFine(10);
                    return 1;
                }
            } else{
                System.out.println("[Guest] No! It's unacceptable. I'm leaving");
                setReview(-10);
                setFine(30);
                setSpending((-70));
                setFine(30);
                return 0;
            }
        }
    }
}
