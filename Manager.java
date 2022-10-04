import java.util.Random;

public class Manager extends Room{
    Random random = new Random();
    public int room_price = 70;
    public int tips; // tips for staff are included in the bill

    public boolean help = true;
    //private int available_rooms;

    public boolean isHelp() {
        return help;
    }

    public int getTips() {
        return tips;
    }

    public void setTips(int tips) {
        this.tips = tips;
    }

    public int getRoom_price() {
        return room_price;
    }

    public void setHelp(boolean help) {
        this.help = help;
    }

    public void setRoom_price(int room_price) {
        this.room_price = room_price;
    }


    public int giveTips(){
        tips = random.nextInt(50);
        return tips;
    }

    public boolean needs_help(){
        help = random.nextBoolean();
        return help;
    }

    public void available() {

        //inheriting the method from Guest
        welcome();

        //inheriting methods from Room
        av_rooms();
        index();
                if (occupied_rooms >= 5) {
                    System.out.println("[Manager] Oh, sorry. We don't have enough free rooms");
                    System.exit(0);

                } else {
                    //check += 70; - room_price
                    System.out.println("[Manager] Your room is " + room_index + ". Take your keys");
                    System.out.println("[Manager] Do you need help with your luggage?");
                }
    }
}
