package Practice10;
import java.util.Random;

public class Practice10_01 {
    public static void main(String[] args) {
        int gender = new Random().nextInt(2);

        switch (gender) {
            case 0:
                System.out.println("あなたは男です");
                break;
            case 1:
                System.out.println("あなたは女です");
                break;        
        }
    }
    
}
