
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class program5 {
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Сиянчук", 12345, bookPhone);
        addNumber("Сиянчук", 54321, bookPhone);
        addNumber("Чапаев", 67890, bookPhone);
        addNumber("Буклина", 13579, bookPhone);
        addNumber("Сиянчук", 24680, bookPhone);
        addNumber("Чапаев", 98765, bookPhone);
        printBook(bookPhone);
       }
}
