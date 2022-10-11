
import java.util.ArrayList;
import java.util.Random;

public class Cleaning extends Person{
        private boolean answer;
        private boolean isCleaned;

        private ArrayList<String> meals = new ArrayList<String>();
        private ArrayList<String> drinks = new ArrayList<String>();
        private String choice1;
        private String choice2;

        public boolean isCleaned() {
            return isCleaned;
        }

        public boolean isAnswer() {
            return answer;
        }

        public void setCleaned(boolean cleaned) {
            isCleaned = cleaned;
        }

        public void setAnswer(boolean answer) {
            this.answer = answer;
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
    }

    @Override
    public void speak(){
        System.out.printf("%sMy name is %s. The room is prepared for you", cleaner, call);
        System.out.println();
    }
        @Override
        public void bye(){
            System.out.printf("%sWe'll work on quality of our service", cleaner);
            System.out.println();
        }
        public void cleaningCheck(){

            Random random = new Random();
            isCleaned = random.nextBoolean();
            if(isCleaned){
                System.out.println("[Guest] The room is so clean");
                setReview(1);
                setTips(7);
            }
            else{
                System.out.println("[Guest] The room is so dirty. Such a bad hotel");
                setReview(-1);
                setFine(10);
                setFine(30);
                System.out.println("[Manager] Oh, we're so sorry. We can make order you food as an apology");
                System.out.println("[Manager] Would you accept it?");
                answer = random.nextBoolean();
                if(answer){
                    System.out.println("[Guest] Fine, i'll except it");
                    setReview(1);
                    setTips(-1);
                    createMeals();
                }
                else{
                    System.out.println("[Guest] No! It's unacceptable. I'm leaving");
                    setReview(-10);
                    setFine(100);
                    System.exit(0);
                }
            }
        }
    }
