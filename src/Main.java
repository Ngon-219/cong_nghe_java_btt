//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        errorException error = new errorException();
        error.setRoomAmount();
        System.out.println(error.getRoomAmount());
        error.createRoom();
        error.getAllRoom();
    }
}
