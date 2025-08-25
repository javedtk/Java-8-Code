import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentHashMap {
    public static void main(String[] args) {
        List<String> localdata = new CopyOnWriteArrayList<>();
        localdata.add("9");
        localdata.add("2");
        localdata.add("3");
        localdata.add("1");
        localdata.add("4");
        //System.out.print(localdata);
        Runnable t = ()->{
        //Thread t working hear
            for (String str : localdata){
                System.out.println(str);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable t2 = ()->{
        //Thread t2 working hear
            localdata.add("6");
            localdata.add("6");
            localdata.add("6");
        };
        new Thread(t2).start();
        new Thread(t).start();


    }
}
