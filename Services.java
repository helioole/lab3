import java.util.Random;

public class Services extends Guest{
    Random random = new Random();
    //other guests' needs such as
    //medical services, taxi, souvenir
    public boolean isBroken;
    public boolean before;
    public  boolean isIll;
    public boolean trip;
    public boolean wants;

    public boolean check_isIll(){
        isIll = random.nextBoolean();
        return isIll;
    }

    public boolean check_trip(){
        trip = random.nextBoolean();
        return trip;
    }

    public boolean check_wants(){
        wants = random.nextBoolean();
        return wants;
    }

    public boolean check_isBroken(){
        isBroken = random.nextBoolean();
        return isBroken;
    }

    public boolean check_before(){
        before = random.nextBoolean();
        return before;
    }
}
