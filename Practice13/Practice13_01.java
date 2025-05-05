package Practice13;
class Animal {
    String name = "Jhon";
    String type = "nothing";

    /**
     * 動物に合わせて鳴き声を出力するメソッド
     * 
     */
    public void cryAnimals() {
        System.out.println(
            switch (type) {
                case "cat" -> "nya-";
                case "dog" -> "wan";
                default -> "特定出来ませんでした";
            }
        );
    }
}

public class Practice13_01 {
    public static void main(String[] args) {
        //Animalをコピーしてポチを出力
        Animal a001 = new Animal();
        a001.name = "pochi";
        System.out.println(a001.name);
        a001.type = "dog";
        a001.cryAnimals();

       //Animalコピーしてタマを出力
       Animal a002 = new Animal();
       a002.name = "tama";
       System.out.println(a002.name);
       a002.type = "cat";
       a002.cryAnimals();
    }
}
