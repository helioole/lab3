import java.util.Random;

public class Manager extends Person{
    Random random = new Random();
    private int occupied_rooms;
    private int room_index = 0;

    public int getRoom_index() {

        return room_index;
    }

    public void setRoom_index(int room_index) {

        this.room_index = room_index;
    }

    @Override
    public void speak(){
        System.out.printf("%sWelcome to our hotel!" + "\n", man);
        System.out.printf("%sMy name is %s. I'll check if we have free rooms", man, call);
        System.out.println();
    }
    @Override
    public void reply(){
        System.out.printf("%sWe hope you enjoy our service", man);
        System.out.println();
    }
    public int available(Porter porter) {
        speak();
        room_index = random.nextInt(6);
        occupied_rooms = random.nextInt(10);

        if (occupied_rooms > 5) {
            System.out.printf("%sOh, sorry. We don't have enough free rooms", man);
            System.out.println();
            return 0;
        } else {
            System.out.println("[Manager] Your room is " + room_index + ". Take your keys");
            reply();
            setReview(5);
            setTips(5);
            setSpending(70);
            porter.bag();
            return 1;
        }
    }
}