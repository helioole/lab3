import java.util.Random;

public class Porter extends Person{
    private String porter = "[Porter] ";

    @Override
    public void speak(){
        System.out.printf("%sMy name is %s. And I'm here to help you", porter, male);
        System.out.println();
    }

    @Override
    public void reply(){
        System.out.printf("%sHave a nice vacation", porter);
        System.out.println();
    }
    public void bag(){
        System.out.printf("%sPlease, let me help you with the luggage", porter);
        System.out.println();
        speak();
        if(weight >= 30){
            System.out.printf("%sIt seems like it's too heavy, please wait until one more porter comes", porter);
            System.out.println();
            setTips(10);
            setReview(1);
        }
        else{
            System.out.printf("%sI'll carry your bags to your room", porter);
            System.out.println();
            setTips(5);
            setReview(1);
        }
    }

}
