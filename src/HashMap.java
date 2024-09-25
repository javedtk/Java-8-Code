import java.util.*;
import java.util.stream.Collectors;

public class HashMap{

    public static void main(String[] args) {
        String str = "Geeks";
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);
        String str1 = "Geekss";
        char try1[] = str1.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
        List<Integer> list = Arrays.asList(1,2,3,5,6,7,5,34,6,4,6,5,5);
        List<Integer> evennumber = list.stream()
        .filter(n -> n % 2 == 0).toList();
        System.out.println(evennumber);
        List<String> str12 = Arrays.asList("abs", "jb", "iuy", "oiu", "oip");
        List<String> assendingorder = str12.stream()
                .sorted()
                .collect(Collectors.toList());
        List<String> decndingorder = str12.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("decending order" + decndingorder + "Accending order" + assendingorder);
        List<List<String>> nestested = Arrays.asList(Arrays.asList("Apple", "Banana", "Mango","Graps","Papaya"),
                Arrays.asList("Apple","Banana", "Mango","Graps","Leechi","Jamun"));
        List<String> flaylist = nestested.stream().flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(flaylist);
        int [] arr = {1,5,7,9,3};
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
              max=arr[1];
            }
            System.out.println(arr);
        }
    }
    }
