class Coffee {
    private String brand;
    private String sweet;
    private String milk;
    private int price;

    public Coffee(String brand, String sweet, String milk, int price) {
        this.brand = brand;
        this.sweet = sweet;
        this.milk = milk;
        this.price = price;
    }

    public void buyDrink() {
        System.out.println(brand + "の甘さは" + sweet + "、ミルク" + "です。" + price + "円になります。");
    }
}

class Juice {
    private String brand;
    private String flavor;
    private int price;

    public Juice(String brand, String flavor, int price){
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    public void buyDrink() {
        System.out.println(brand + "の" + flavor + "味です。" + price + "円になります。");
    }
}

public class ComprehensiveIntermediate02_05 {
    public static void main(String[] args) {
        Juice bayarisu = new Juice("バヤリース", "オレンジ", 130);
        Juice afternoontea = new Juice("午後の紅茶", "レモンティー", 150);
        Coffee boss = new Coffee("ボス", "控え目", "無し", 110);
        Coffee georgia = new Coffee("ジョージア", "甘め", "入り", 120);

        bayarisu.buyDrink();
        afternoontea.buyDrink();
        boss.buyDrink();
        georgia.buyDrink(); 
    }
}
