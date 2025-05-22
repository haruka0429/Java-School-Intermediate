package ComprehensiveIntermediate01;
import java.util.Scanner;

public class ComprehensiveIntermediate01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("整数を入力してください");
        int inputNum = sc.nextInt();

        System.out.println("入力された値は" + inputNum + "です");

        if (inputNum / 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        sc.close();
    }
    
}
