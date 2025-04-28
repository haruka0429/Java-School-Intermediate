public class Practice12_02 {
    public static void main(String[] args) {
        greet("朝");
        greet("昼");
        greet("夜");

    }
    public static void greet(String greet) {
        if (greet.equals("朝")) {
            System.out.println("Good morining!");
        } else if (greet.equals("昼")) {
            System.out.println("Good afternoon!");
        } else if (greet.equals("夜")) {
            System.out.println("Good evening!");
        }

    }

}