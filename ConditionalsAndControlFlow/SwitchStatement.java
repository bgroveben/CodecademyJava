public class SwitchStatement {
    public static void main(String[] args) {

        char penaltyKick = 'L';

        switch (penaltyKick) {

            case 'L': System.out.println("Messi shoots to the left and scores! GOOOOOOOOOOOOOOOOOOAL!");
                break;
            case 'R': System.out.println("Messi shoots to the right and misses the goal!");
                break;
            case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
                break;
            default:
                System.out.println("Messi is in position...");
        }
        // Again! But with feeling this time.
        int restaurantRating = 3;

        switch (restaurantRating) {

            case 1: System.out.println("This restaurant is not my favorite.");
                break;
            case 2: System.out.println("This restaurant is good.");
                break;
            case 3: System.out.println("This restaurant is fantastic!");
                break;
            default: System.out.println("I've never dined at this restaurant.");
                break;
        }
    }
}
