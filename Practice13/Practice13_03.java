package Practice13;
class Greeting {
    String country = "日本";
    String greet = "japan";

    public String greet(String greet) {
        if (greet.equals("japan")) {
            return "こんにちは";
        } else if (greet.equals("korea")) {
            return "アンニョンハセヨ";
        } else if (greet.equals("unknown")) {
            return "わかりません";
        } else {
            return greet;
        }
    }
}

public class Practice13_03 {
    public static void main(String[] args) {
        
        /*Greetingクラスからインスタンスを生成する */
        Greeting greetJapan = new Greeting();
        greetJapan.country = "日本";
        System.out.println(greetJapan.country + "は" + greetJapan.greet("japan"));

        Greeting greetKorea = new Greeting();
        greetKorea.country = "韓国";
        System.out.println(greetKorea.country + "は" + greetKorea.greet("korea"));

        Greeting greetUnknown = new Greeting();
        greetUnknown.country = "その他";
        System.out.println(greetUnknown.country + "は" + greetUnknown.greet("unknown"));

    }
    
}
