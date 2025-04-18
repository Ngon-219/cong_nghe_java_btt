import java.util.ArrayList;
import java.util.Scanner;

public class errorException {
    private int roomAmount;

    public void createRoom() {
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < this.roomAmount; i++) {
            list.add("Room " + i);
        }
    }

    public void setRoomAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of room: ");
        this.roomAmount = scanner.nextInt();
    }

    public int getRoomAmount() {
        return roomAmount;
    }

    public void getAllRoom() {
        for (int i = 0; i < this.roomAmount; i++) {
            System.out.println("Room " + i);
        }
    }
}
