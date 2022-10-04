import java.util.Random;

public class Check extends Guest{
    Random random = new Random();
    public boolean answer;
    public boolean isCleaned;

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

    public boolean check_answer(){
        answer = random.nextBoolean();
        return answer;
    }

    public boolean check_cleaned(){
        isCleaned = random.nextBoolean();
        return isCleaned;
    }
}
