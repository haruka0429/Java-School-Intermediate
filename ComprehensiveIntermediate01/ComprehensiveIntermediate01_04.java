package ComprehensiveIntermediate01;
import java.util.Scanner;

public class ComprehensiveIntermediate01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("人数を入力してください。");
        int person = sc.nextInt();

        int total = totalCost(person); 
        System.out.println("合計入場料金：" + total + "円");

        sc.close();
    }
    
    private static int totalPerson (int person) {
        if (person >= 20 ) {
            return 500;
        } else if (person >= 5) {
            return 550;
        } else {
            return 600;
        }
    }

    private static int totalCost (int person) {
        int pricePerson = totalPerson(person);
        return pricePerson * person;

    }
}
