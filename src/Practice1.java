import java.util.*;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice1 {
    static public void main(String[] args) {
        //Stream.of(0,1,2,3,4,5,6,7,8,9).skip(6).forEach(num->System.out.println(num));

//        int ar[] = {1, 8, 0, 4, 7, 9, 3, 2, 8, 86};
//        List<Integer> list = new ArrayList<>();
        //       int sum = 0;
//        Arrays.sort(ar);
//        System.out.println("Largest: "+ ar[0]);
//        System.out.println("Smallest: "+ ar[ar.length - 1]);
//        for(int i = ar.length - 1; i > 0; i--){
//            //System.out.print("Reversed Array is: ");
//            sum += ar[i];
//            System.out.print(ar[i]+ " ");
//
//        }
//        System.out.println();
//        System.out.print("The sum is: "+sum);
//    for(int i = 0; i < ar.length; i++){ //i = i + 1
//        list.add(ar[i]);
//    }
        // System.out.println(list);
//        for(int i = 0; i < list.size(); i++){
//            if(list.get(i))
//        }
//
//

//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, "javed");
//        map.put(2, "juned");
//        map.put(3, "minhaz");
//        map.put(null, null);
//        System.out.println(map);
        List<Integer> list = Arrays.asList(1,3,5,7,6,5,8);
        Optional<Integer> opetnol = list.stream().distinct().sorted((a,b) -> b - a).skip(2).findFirst();
//        System.out.println(list);
        Integer secnodhighest = opetnol.get();
        System.out.println(secnodhighest);
    }
}

