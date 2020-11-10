import textio.TextIO;
import java.util.Scanner;

public class CountChange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many 5 cent coins: ");
        int fiveCents = sc.nextInt();
        System.out.print("How many 10 cent coins: ");
        int tenCents = sc.nextInt();
        System.out.print("How many 20 cent coins: ");
        int twentyCents = sc.nextInt();
        System.out.print("How many 50 cent coins: ");
        int fiftyCents = sc.nextInt();
        System.out.print("How many 1 dollar coins: ");
        int oneDollar = sc.nextInt();
        System.out.print("How many 2 dollar coins: ");
        int twoDollar = sc.nextInt();
        double total = (fiveCents*0.05 + tenCents*0.1 + twentyCents*0.2 + fiftyCents*0.5 + oneDollar + twoDollar*2);

        System.out.println("Total change you have is $" + total);
    }  // end main()

}  // end class