
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

public class Practice15_02 {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("kubo");
        list.add("mitoma");
        list.add("kamada");
        list.add("kamada");

        TreeSet<String> set = new TreeSet<String>(list);
        
        for (String arr : set) {
            System.out.println(arr);
        }
    }
    
}
