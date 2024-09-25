interface Father{
    default void GoFather(){
        System.out.println("Jabar Jasti Chal");
    }
}
class Child implements Father{
 public void GoFather(){
     System.out.println("Ab Chal Ache Se");
 }
}

public class DefaultMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.GoFather();
    }
}
