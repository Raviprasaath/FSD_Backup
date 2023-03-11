package HashMap.Practise;
import java.util.HashMap;
import java.util.Set;

public class hashmapPractice {
    public static void main(String[] args) {
        HashMap <String, Integer> hm = new HashMap<>();
        hm.put ("idli", 20);
        hm.put ("dosai", 30);
        hm.put ("poori", 50);
        hm.put ("vadai", 40);

        // System.out.println(hm.entrySet());
        // System.out.println(hm.values());
        // System.out.println(hm.keySet());

        HashMap <String, Integer> hm2 = new HashMap<>();
        hm2.putAll(hm);
        System.out.println(hm2.size());
        System.out.println(hm2.isEmpty());
        System.out.println(hm2.get("dosai"));
        System.out.println(hm2.containsKey("poori"));
        System.out.println(hm2.containsValue(30));
        System.out.println(hm2.remove("dosai"));
        System.out.println(hm2);
        System.out.println(hm2.remove("poori", 50));
        System.out.println(hm2);
    }
}
