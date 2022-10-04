public class Complaint  extends Unsatisfied {

    public void feedbackCheck() {
        check_answer();
        check_cleaned();
        if (!answer && !isCleaned)  {
            System.out.println("[REVIEW] This is not the best place to stay at");
        }
    }
}

