public class Clean extends Check {
    public boolean clean;
//    public int cleaning_tips = 0;
//    public int cleaning_review = 0;

    public void cleaningCheck() {
        check_answer();
        check_cleaned();
        if (isCleaned) {
            System.out.println("[Guest] The room is so clean");
//            cleaning_review++;
//            cleaning_tips++;
        }
    }
}
