import java.util.ArrayList;
import java.util.Random;

public class Medical extends Services{
    Random random = new Random();
    private ArrayList<String> meds = new ArrayList<String>();
    private String med;
    public double temperature = 36.6;
    public float fever;

    public void hasFever(){

        meds.add("Paracetamol");
        meds.add("Rinza");
        meds.add("Panadol");

        String rep = meds.get(random.nextInt(meds.size()));
        System.out.println("[Doctor] Please, take " + med);

    }
    public void help(){
        check_isIll();
        if(isIll) {
            System.out.println("[Guest] I need a medical service");
            temperature = random.nextFloat(6);
            if (temperature >= 38) {
                hasFever();
            } else {
                System.out.println("[Doctor] It seems that you're healthy");
            }
        }
    }
}
