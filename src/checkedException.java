import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class checkedException {
    private ArrayList<String> myLikedSongs = new ArrayList<>();
    private String user;

    checkedException() {
        this.myLikedSongs.add("Bong Hong Thuy Tinh");
        this.myLikedSongs.add("Ra Khoi");
        this.myLikedSongs.add("Tieng Goi");
    }

    private void getLikedSongs() throws SecurityException  {
        if (user.equals("hucer")) {
            System.out.println("My liked songs: " + this.myLikedSongs);
        } else {
            throw new SecurityException ("User is not authorized to view the liked songs.");
        }
    }

    public void setUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        this.user = scanner.nextLine();
    }

    public String getUser() {
        return user;
    }

    public static void main(String[] args) {
        checkedException checked = new checkedException();
//        System.out.println(checked.getUser());
        boolean check = true;
        while(check) {
            checked.setUser();
            try {
                checked.getLikedSongs();
                check = false;
            } catch (SecurityException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
