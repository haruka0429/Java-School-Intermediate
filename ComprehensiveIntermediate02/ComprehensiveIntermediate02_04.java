import java.util.Random;
import java.util.Scanner;

public class ComprehensiveIntermediate02_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("ジャンケン");

        //数字を入力される、それ以外の場合はエラー表示で再度入力するように戻す
        while (true) {
            System.out.println("0:グー 1:チョキ 2: パー ＞数字を入力してください");

            int userChoice = scanner.nextInt();
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("エラー：0、1、2のいずれかを入力してください。");
                continue;
            }
            
            int cpuChoice = random.nextInt(3);

            //選択結果の表示
            System.out.println("あなたの選択：" + handName(userChoice));
            System.out.println("相手の選択：" + handName(cpuChoice));

            //勝負結果の表示
            if (userChoice == cpuChoice) {
                System.out.println("あいこです。");
            } else if ((userChoice == 0 && cpuChoice == 1) || (userChoice == 1 && cpuChoice == 2)) {
                System.out.println("あなたの勝ちです。");
            } else {
                System.out.println("相手の勝ちです。");
            }
            //終了の確認
            System.out.println("もう一度遊びますか？　yes or no");
            String playAgain = scanner.next();
            if (playAgain.equals("no")) {
                System.out.println("ジャンケンを終了します。");
                break;
            }
        }
        scanner.close();
    }

    public static String handName(int hand) {
        switch (hand) {
            case 0: return "グー";
            case 1: return "チョキ";
            case 2: return "パー";
            default : return "";
        }
    }
    
}
