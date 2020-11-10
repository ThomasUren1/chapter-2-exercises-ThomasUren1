import textio.TextIO;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name.toUpperCase() + ", nice to meet you!");
    }  // end main()

}  // end class