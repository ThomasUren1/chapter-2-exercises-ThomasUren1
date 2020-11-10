public class RollTheDice {

    public static void main(String[] args) {

        int firstRoll = (int)(Math.random()*6) + 1;
        int secondRoll = (int)(Math.random()*6) + 1;
        int combinedRoll = firstRoll + secondRoll;

        System.out.println("The first die roll comes up as " + firstRoll);
        System.out.println("The second die roll comes up as " + secondRoll);
        System.out.println("Your total rolls are " + combinedRoll);

    }  // end main()

}  // end class