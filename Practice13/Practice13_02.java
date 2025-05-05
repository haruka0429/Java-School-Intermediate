package Practice13;
class Shop {
    String name = "toy"; 
    
    public void total(int x) {
        System.out.println("  売上" + x);
    }    
}


public class Practice13_02 {
    public static void main(String[] args) {
        
        Shop s1 = new Shop();
        s1.name = "おもちゃ屋さん";
        System.out.print(s1.name);
        s1.total(200000);

        Shop s2 = new Shop();
        s2.name = "スポーツショップ";
        System.out.print(s2.name);
        s2.total(550000);
    }

    
}
