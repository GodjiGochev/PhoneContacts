import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneContacts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //My starting title
        System.out.println("Contacts");
        //Title to enter option
        System.out.print("Enter option: ");
        //LinkedHashMap where I will keep my phone numbers
        LinkedHashMap<String, String> phoneNumberStored = new LinkedHashMap<>();
        //New input for the loop
        String command = scanner.nextLine();
        //While loop for the command (input)
        while (!command.equals("exit")) {
            switch (command) {
                //Command for the adding numbers option
                case "Add":
                    //Title to enter name and number
                    System.out.print("Enter name: ");
                    String inputName = scanner.nextLine();
                    System.out.print("Enter number: ");
                    String inputNumber = scanner.nextLine();
                    phoneNumberStored.put(inputName, inputNumber);
                    break;
                    //Command for the delete option
                case "Delete":
                    System.out.print("Enter contact name to delete: ");
                    String contactToRemove = scanner.nextLine();
                    if (phoneNumberStored.containsKey(contactToRemove)){
                        phoneNumberStored.remove(contactToRemove);
                        System.out.println(contactToRemove + " Has been deleted!");
                    }else {
                        System.out.println("No such contact.");
                    }
                    break;
                    //Command for colling by name
                case "Call":
                    System.out.print("Enter name to call: ");
                    String nameToCall = scanner.nextLine();
                    if (phoneNumberStored.containsKey(nameToCall)){
                        System.out.println("Calling... " + nameToCall);
                    }else {
                        System.out.println("Calling canceled!");
                    }
                    break;
                    //Command for viewing the contact list option
                case "View":
                    for (Map.Entry<String, String> entry : phoneNumberStored.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        System.out.println(key);
                        System.out.println(value);
                    }
                    break;
                default:
                    System.out.println("Not an option");
                    break;
            }
            System.out.println("Enter option: ");
            command = scanner.nextLine();
        }
        scanner.close();
    }
}

