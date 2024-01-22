import java.util.Scanner;

public class PhoneContacts {
    public static void main(String[] args) {
        //Scanner so I can log in my new numbers
        Scanner scanner = new Scanner(System.in);
        //My starting title
        System.out.println("Contacts");
        //Title to enter the number
        System.out.print("Enter number: ");
        int inputPhoneNumber = Integer.parseInt(scanner.nextLine());
        //Title to enter a name
        System.out.print("Enter name: ");
        String inputName = scanner.nextLine();
        System.out.println(inputPhoneNumber);
    }
}
