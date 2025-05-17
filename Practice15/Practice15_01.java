
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Practice15_01 {
    public static void main(String[] args) {
        //ArrayList<データ型> 変数名 = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();

        list.add("kubo");
        list.add("mitoma");
        list.add("kamada");
        list.add("kamada");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
         
    }
    
}
