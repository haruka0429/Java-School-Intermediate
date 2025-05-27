package ComprehensiveIntermediate01;
import java.util.Scanner;

public class ComprehensiveIntermediate01_02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("整数を3つ入力してください");
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt(); 

        //System.out.println("入力された値は" + i + "、" + j + "、" + k + "です");

        if ( i <= j && j <= k ) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

        sc.close();

    }
    
}
