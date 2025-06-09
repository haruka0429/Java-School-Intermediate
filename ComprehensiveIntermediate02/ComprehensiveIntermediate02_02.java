package ComprehensiveIntermediate02;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class ComprehensiveIntermediate02_02 {
    public class MenuManager{
    // ここにフィールドを追加します。
        Map<String,ArrayList> map = new HashMap<>();
    // コンストラクタ
        MenuManager(){
            // サンドイッチメニューの登録
            ArrayList<String> list = new ArrayList<>();
            list.add("ハンバーガー");
            list.add("チーズバーガー");
            list.add("ダブルチーズバーガー");
            map.put("sandwitch",list);
            //ドリンクメニューの登録
            list = new ArrayList<>();
            list.add("コーラ");
            list.add("オレンジジュース");
            list.add("コーヒー");
            map.put("drink",list);
            //サイドメニューの登録
            list = new ArrayList<>();
            list.add("フライドポテト");
            list.add("チキンナゲット");
            list.add("アップルパイ");
            map.put("sidemenu",list);
        }

        // ここにsearchMenuを作成します。
        public void searchMenu(String menu) {
            for (String category : map.keySet()) {
                ArrayList<String> list = map.get(category);
                if (list.contains(menu)) {
                    System.out.println(menu + "は、" + category + "に含まれています。");
                }
            }
            System.out.println("該当するmenuはありません。");
        }
        // ここにsetMenuを作成します。
        public void setMenu(String category, String menu) {
            ArrayList<String> list = map.get(category);
            if (list == null ) {
                list = new ArrayList<>();
                map.put(category, list);
            }
            list.add(menu);
        }

        // ここにshowMenuを作成します。
        public void showMenu(String category) {
                System.out.println(category + " メニュー: " + map.get(category));
        }
    }
    public static void main(String[] args) {
        MenuManager manager = new MenuManager();
        // サンドイッチメニューの表示
        manager.showMenu("sandwitch");
        // サンドイッチメニューにビッグバーガーを追加
        manager.setMenu("sandwitch","ビッグバーガー");
        // サンドイッチメニューの表示
        manager.showMenu("sandwitch");
        // 「ホットミルク」をメニューから検索
        manager.searchMenu("ホットミルク");
        // 「オレンジジュース」をメニューから検索
        manager.searchMenu("オレンジジュース");
    }
    
}
