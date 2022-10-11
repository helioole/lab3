import java.util.Random;

public class Manager extends Person{
    private int occupied_rooms;
    private boolean isOccupied;
    private int room_index = 0;

    public boolean isOccupied() {

        return isOccupied;
    }

    public int getAvailable_rooms() {
        return occupied_rooms;
    }

    public int getRoom_index() {

        return room_index;
    }

    public void setRoom_index(int room_index) {

        this.room_index = room_index;
    }

    public void setAvailable_rooms(int available_rooms) {

        this.occupied_rooms = available_rooms;
    }

    public void setOccupied(boolean occupied) {

        isOccupied = occupied;
    }
    @Override
    public void speak(){
        System.out.printf("%sMy name is %s. The room is prepared for you", man, call);
        System.out.println();
    }

    @Override
    public void bye(){
        System.out.printf("%sWe'll work on quality of our service", man);
        System.out.println();
    }
    public void available() {
        Random random = new Random();
        this.room_index = random.nextInt(6);
        this.occupied_rooms = random.nextInt(10);
        System.out.printf("%sWelcome to our hotel", man);
        System.out.println();
        if (occupied_rooms >= 5) {
            isOccupied = true;
            setReview(-1);
            System.out.printf("%sOh, sorry. We don't have enough free rooms", man);
            System.out.println();
            System.exit(0);
        } else {
            setReview(-1);
            setTips(3);
            System.out.println("[Manager] Your room is " + room_index + ". Take your keys");
            setCheck(70);
        }
    }
}