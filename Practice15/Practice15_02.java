package Practice15;
import java.util.TreeSet;
import java.util.Set;

public class Practice15_02 {
    public static void main(String[] args) {
        //Set<データ型> 変数名 = new TreeSet<データ型>();
        //TreeSet<データ型> 変数名 = new TreeSet<データ型>();
        // TreeSetデータを作成 右辺のデータ型は省略可
        Set<String> list = new TreeSet<>();

        list.add("kubo");
        list.add("mitoma");
        list.add("kamada");
        list.add("kamada");

        System.out.println(list);
    }
    
}
