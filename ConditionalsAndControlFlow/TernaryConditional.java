public class TernaryConditional {
    public static void main(String[] args) {
        int fuelLevel = 3;
        char canDrive = (fuelLevel > 0) ? 'Y' : 'N';
        System.out.println(canDrive);

    // And, just to drive the point home (pun intended)
        int pointsScored = 21;
        char gameResult = (pointsScored > 20) ? 'W' : 'L';
        System.out.println(gameResult);
    }
}
