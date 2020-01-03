import java.util.Random;

public class player {

    int number = 0;
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I'm gusseing " + number);
    }
}