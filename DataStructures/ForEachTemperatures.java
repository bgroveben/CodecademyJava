import java.util.ArrayList;

public class ForEachTemperatures {
    public static void main(String[] args) {
        ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
        weeklyTemperatures.add(78);
        weeklyTemperatures.add(67);
        weeklyTemperatures.add(89);
        weeklyTemperatures.add(94);

        // This is a for each loop. The colon can be interpreted as "in".
        for ( Integer temperature : weeklyTemperatures ) {
            System.out.println(temperature);
        }
    }
}
