import java.util.ArrayList;
import java.util.Random;

public class Medical extends Services{
    Random random = new Random();
    private ArrayList<String> meds = new ArrayList<String>();
    private String med;

    public void hasFever(){

        meds.add("Paracetamol");
        meds.add("Rinza");
        meds.add("Panadol");

        String rep = meds.get(random.nextInt(meds.size()));
        System.out.println("[Doctor] Please, take " + med);

        meds.clear();
    }
    public void help(){
        check_isIll();
        if(isIll) {
            System.out.println("[Guest] Ugh, I don't feel well, I need a doctor");
            if (temperature >= 38) {
                hasFever();
                setReview(1);
            } else {
                System.out.println("[Doctor] You don't have any symptoms. You just need to rest");
            }
        }
    }
}
