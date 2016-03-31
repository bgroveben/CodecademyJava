import java.util.*;

public class Olympics {
    public static void main(String[] args) {
        // Some Olympic Sports
        ArrayList<String> olympicSports = new ArrayList<String>();
        olympicSports.add("Archery");
        olympicSports.add("Boxing");
        olympicSports.add("Cricket");
        olympicSports.add("Diving");

        System.out.println("There are " + olympicSports.size() + " Olympic sports in this list. They are: ");
        for (String sport: olympicSports) {
            System.out.println(sport);
        }
        // Some Host Cities with Year
        HashMap<String, Integer> hostCities = new HashMap<String, Integer>();
        hostCities.put("Beijing", 2008);
        hostCities.put("London", 2012);
        hostCities.put("Rio de Janiero", 2016);

        for (String city: hostCities.keySet()) {
            if (hostCities.get(city) < 2016) {
                System.out.println(city + " hosted the Summer Olympics in " + hostCities.get(city) + ".");
            } else {
                System.out.println(city + " will host the Summer Olympics in " + hostCities.get(city) + ".");
            }
        }
    }
}
