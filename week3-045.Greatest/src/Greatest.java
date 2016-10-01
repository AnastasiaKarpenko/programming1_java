
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greatest1 = Math.max(number1, number2);
        int greatest2 = Math.max(greatest1, number3);

        return greatest2;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}