import java.util.Random;

public class Room extends Guest{
    public int room_index;
    public int occupied_rooms;

    public int getRoom_index() {
        return room_index;
    }

    public int getOccupied_rooms() {
        return occupied_rooms;
    }


    public void setOccupied_rooms(int occupied_rooms) {
        this.occupied_rooms = occupied_rooms;
    }

    public void setRoom_index(int room_index) {
        this.room_index = room_index;
    }

    public int av_rooms(){
        Random random = new Random();
        occupied_rooms = random.nextInt(6);
        return occupied_rooms;
    }

    public int index(){
        Random random = new Random();
        room_index= random.nextInt(10);
        return room_index;
    }
}
