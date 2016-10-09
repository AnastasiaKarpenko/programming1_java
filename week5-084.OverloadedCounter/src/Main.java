public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter counter1 = new Counter(1, false);
        Counter counter2 = new Counter(1);
        Counter counter3 = new Counter(true);
        Counter counter4 = new Counter();
        
        
        counter1.decrease();
        System.out.println(counter1.value());
        counter1.decrease(3);
        System.out.println(counter1.value());
        counter1.increase();
        System.out.println(counter1.value());
        counter1.increase(10);
        System.out.println(counter1.value());


    }
}
