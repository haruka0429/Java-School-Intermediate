package Practice10;
import java.util.Random;

public class Practice10_03 {
    public static void main(String[] args) {
        int age = new Random().nextInt(21);
        int gender = new Random().nextInt(2);

        System.out.println(age);
        System.out.println(gender);

        switch1: switch (gender) {
            case 0:
                switch (age) {
                    case 0, 1, 2, 3: 
                        System.out.println("あなたはbabyな男です");
                        break switch1;
                    case 4, 5:
                        System.out.println("あなたはchildな男です");
                        break switch1;
                    case 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17:
                        System.out.println("あなたはkidな男です");
                        break switch1;
                    default:
                        System.out.println("あなたはadultな男です");
                        break switch1;
                } 
            case 1:
                switch (age) {
                    case 0, 1, 2, 3:
                        System.out.println("あなたはbabyな女です");
                        break;
                    case 4, 5:
                        System.out.println("あなたはchildな女です");
                        break;
                    case 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17:
                        System.out.println("あなたはkidな女です");
                        break;
                    default:
                        System.out.println("あなたはadultな女です");
                }
        }
    }
}