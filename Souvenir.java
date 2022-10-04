import java.util.Random;
import java.util.*;

public class Souvenir extends Services{
    Random random = new Random();
    private int index;
    Map<String, Integer> map = new HashMap<>();

    public void things(){
        check_wants();

        map.put("Statue", 55);
        map.put("Pot", 13);
        map.put("Picture", 33);

        Set<String> keySet = map.keySet();
        List<String> keyList = new ArrayList<>(keySet);

        int size = keyList.size();
        int randIdx = new Random().nextInt(size);

        String randomKey = keyList.get(randIdx);
        Integer randomValue = map.get(randomKey);

        if(wants){
            System.out.println("[Guest] I would like to buy a souvenir");
            for(Map.Entry mp : map.entrySet()){
                System.out.println("[OPTION] Souvenir: " + mp.getKey() + " Price: " + mp.getValue());
            }
            System.out.println("[Client] I'll pick a " + randomKey);
            System.out.println("[Manager] You are our loyal guest, that's why the hotel will cover the souvenir price");

        }
    }

}
