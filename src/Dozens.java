import java.util.Scanner;

public class Dozens {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("How many eggs do you have: ");
      int totalEggs = sc.nextInt();

      String textOut = "Your number of eggs is ";

      if (totalEggs >= 12){
         int dozenEggs = totalEggs/12;
         totalEggs %= 12;
         textOut += dozenEggs + " dozen, ";
      }
      if (totalEggs != 0){
         textOut += "and " + totalEggs;
      }

      System.out.println(textOut);
   }  // end main()

}  // end class