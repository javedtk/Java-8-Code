import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee {

    public static void main(String[] args){
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Javed", "9005296439", 101));
        emps.add(new Emp("Juned", "9118224381", 108));
        emps.add(new Emp("Minhaz", "8090619709", 103));
        emps.add(new Emp("Salamn", "9008765434", 102));
        System.out.println(emps);
        //Collections.sort(emps);

        Collections.sort(emps, new IdComprater());
        System.out.println(emps);
        Collections.sort(emps, new NameCamprater());
        System.out.println(emps);

    }
}
