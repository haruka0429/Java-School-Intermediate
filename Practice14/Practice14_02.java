
import java.util.Random;

public class Practice14_02 {
    public static void main(String[] args) {
        
        try {
            Test();

        } catch (ArithmeticException e) {
            System.out.println("計算例外をキャッチしました。");
        } catch (NullPointerException e) {
            System.out.println("ぬるぽをキャッチしました。");
        } finally {
            System.out.println("finally計算終了");
        }
        System.out.println("処理終了");
    }

    static void Test()  {
        Random random = new Random();
        int num = random.nextInt(2);

        //ランダムで出るか確認                   
        System.out.println(num);

        if (num == 0) {
            System.out.println(num / 0);
        } else if (num == 1) {
            String str = null;
            System.out.println(str.length());
        }
       

    }
    
}
