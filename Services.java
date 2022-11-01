import java.util.Random;

public class Services extends Guest implements Int_Service{
    Random random = new Random();
    public boolean isBroken;
    public boolean before;
    public  boolean isIll;
    public boolean trip;

    public boolean check_isIll(){
        isIll = random.nextBoolean();
        return isIll;
    }

    public boolean check_trip(){
        trip = random.nextBoolean();
        return trip;
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
