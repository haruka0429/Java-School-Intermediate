package Practice14;
public class Practice14_01 {
    public static void main(String[] args) {
        String str = null;
        try {
            if(str != null) {
                //System.out.println("ぬるぽをキャッチしました。");
                System.out.println(str.length());
            } else {
                System.out.println("ぬるぽをキャッチしました。");
                //throw new NullPointerException();
            } 
        } catch(NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("fainally ブロックです。");
        }
        System.out.println("処理終了");
    }
}
