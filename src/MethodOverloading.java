abstract class MethodOverloading {
    abstract void run();}
    class Honda extends MethodOverloading{
        void run(){
            System.out.println("bike is running");
        }
        public static void main(String[] args){
            MethodOverloading obj = new Honda();
            obj.run();
        }
    }
