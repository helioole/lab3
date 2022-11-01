public class Accountant extends Person {
    public void giveFeedbackDay() {
        System.out.printf("Profit: %d" + " dollars" +"\n", spending);
        System.out.printf("Overall income: %d" + " dollars" +"\n", spending + tips - fine);
    }
    public void giveReview(){
        if(review <= 30){
            System.out.println("[REVIEW] Bad hotel");
        }
        else if(review > 31 && review <= 60){
            System.out.println("[REVIEW] Not bad, but not good");
        }
        else if(review > 61 && review <= 100){
            System.out.println("[REVIEW] People started to visit the hotel more");
        }
        else if(review > 1011){
            System.out.println("[REVIEW] 5 Stars Hotel");
        }

    }
    public void giveTips(){
        System.out.printf("Tips: %d" + " dollars" + "\n", tips);
    }

    public void giveFine(){
        System.out.printf("Fines: %d" + " dollars" +"\n", fine);
    }

}