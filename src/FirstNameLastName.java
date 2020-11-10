import java.util.Scanner;

public class FirstNameLastName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name and last name, separated by a space.");
        System.out.print("? ");
        String fullName = sc.nextLine();

        String firstName = fullName.split(" ")[0];
        String lastName = fullName.split(" ")[1];

        System.out.println("Your first name is " + firstName + ", which has " + firstName.length() + " characters");
        System.out.println("Your last name is " + lastName + ", which has " + lastName.length() + " characters");
        System.out.println("Your initials are " + firstName.charAt(0) + lastName.charAt(0));

    }

}