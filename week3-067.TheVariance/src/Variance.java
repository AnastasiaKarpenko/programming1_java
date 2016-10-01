import java.util.ArrayList;

public class Variance {
     
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
    
     
    public static double average(ArrayList<Integer> list) {
        int sum = sum(list);
        double average = (double)sum/list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        double sumDiffsSquared = 0.0;
        double avg = average(list);
        for (int value : list) {
            double diff = value - avg;
            diff *= diff;
            sumDiffsSquared += diff;
        }
   return sumDiffsSquared  / (list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
