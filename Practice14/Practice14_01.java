
public class Practice14_01 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
                
        } catch(NullPointerException e) {
            System.out.println("ぬるぽをキャッチしました。");
        } finally {
            System.out.println("fainally ブロックです。");
        }
        System.out.println("処理終了");
    }
}
