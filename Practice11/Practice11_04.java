package Practice11;
import java.util.Scanner;

public class Practice11_04 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 6) {
            Scanner scan = new Scanner(System.in);
            System.out.println("何段＞");
            int inputNum = scan.nextInt();
            
            if (inputNum <= 5) {
                for (int x = 1; x <= inputNum; x++) {
                    for(int y = 1; y <= inputNum; y++) {
                        if (inputNum < x + y) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            } else if (inputNum > 5) {
                continue;
                
            }
        }

    }
    
}
