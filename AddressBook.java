import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args){
        System.out.println("Welcome to address book");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name");
        String firstName = scanner.next();
        System.out.println("Please enter last name");
        String lastName = scanner.next();

        System.out.println("AddressBook Firstname" + firstName + " LastName " + lastName);
        scanner.close();
    }
}

