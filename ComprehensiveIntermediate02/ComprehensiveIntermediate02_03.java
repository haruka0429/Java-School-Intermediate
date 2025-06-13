package ComprehensiveIntermediate02;
import java.util.Random;
import java.util.Scanner;

public class ComprehensiveIntermediate02_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("ぞろ目で大当たり！チャンスは30回");
        System.out.println("beginと入力してください。");

        String input = scan.nextLine();

        //biginを入力しなかった場合
        if (!input.equals("begin")) {
            System.out.println("開始しませんでした。終了します。");
            return;
        }
        //結果を処理
        boolean hit = slotMachine();
        machineResult(hit);

        scan.close();
    }

     // スロットマシーンを開始
    public static boolean slotMachine() {
         Random random = new Random();

        for (int i = 1; i <= 30; i++) {
            int num1 = random.nextInt(9) + 1;
            int num2 = random.nextInt(9) + 1;
            int num3 = random.nextInt(9) + 1;

            System.out.println(i + "回目" + num1 + num2 + num3);

            if (num1 == num2 && num2 == num3) {
                System.out.println(i + "回目で大当たりです。おめでとうございます！");
                return true;
            }
        }
        return false;
    }

        // 大当たりが出なかった場合の結果を表示する
    public static void machineResult(boolean hit) {
        if (!hit) {
            System.out.println("残念でした。終わります。");
        }

    }
}
