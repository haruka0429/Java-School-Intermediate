package ComprehensiveIntermediate01;
import java.util.Scanner;

public class ComprehensiveIntermediate01_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("係数aを入力してください");
        int a = sc.nextInt();
        System.out.println("係数bを入力してください");
        int b = sc.nextInt();
        System.out.println("係数cを入力してください");
        int c = sc.nextInt(); 

        //判別式の計算
        int discriminant = ( b * b ) - ( 4 * a * c );

        //計算答え確認用
        //System.out.println(discriminant);

        if (discriminant > 0) {
            System.out.println("２つの実数解をもつ");
        } else if (discriminant == 0) {
            System.out.println("重解");
        } else {
            System.out.println("実数解なし");
        }

        sc.close();

    }
    
}
