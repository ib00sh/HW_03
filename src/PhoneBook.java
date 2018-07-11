import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    HashMap<String, HashSet<String>> hm;

    public PhoneBook() {
        this.hm = new HashMap<>();
    }

    public void add(String name, String numberPhone) {
        HashSet<String> hs = hm.getOrDefault(name, new HashSet<>());
        hs.add(numberPhone);
        hm.put(name, hs);
    }

    public void findString(String name) {
        if( hm.containsKey(name)){
            System.out.println(hm.get(name));
        }
        else {
            System.out.println("Данная фамилия отсутсвует");
        }
    }
}
