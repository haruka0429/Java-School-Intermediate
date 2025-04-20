package Practice11;
import java.util.Random;

public class Practice11_03 {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            int num = new Random().nextInt(6) + 1;
            //System.out.println(num);
            if (num % 2 != 0) {
                System.out.println((x + 1) + "回目、" + num + "が出ました");
            }
        x++;    
        }
            
    }
    
}
