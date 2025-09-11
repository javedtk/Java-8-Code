package CollectionsFramewrok;

import java.util.*;

public class HelloDada {
    public static void main(String[] args) {
        ArrayList<Integer> Int = new ArrayList<>();
        Int.add(1);
        Int.add(2);
        Map<Integer, String>map = new HashMap<>();
        map.put(1,"javed");
        map.put(2,"juned");
        Set<Integer> set = new HashSet<>(Int);
        System.out.println("set" + set);
        System.out.println("map output" + map);
        Collections.sort(Int);
        System.out.println(set);
    }

}
