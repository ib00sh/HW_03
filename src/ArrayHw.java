import java.util.HashMap;

public class ArrayHw {
        public static void main(String[] args) {

            String[] arr = {"Максим","Иван","Максим","Алешка"};

            HashMap<String, Integer> hm = new HashMap<>();

            for(String o: arr) {
                hm.put(o, hm.getOrDefault(o,0) + 1);
            }

            System.out.println(hm);
        }
    }

