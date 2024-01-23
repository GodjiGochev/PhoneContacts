import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class phonecontacts {
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
                case "Add":
                    //Title to enter name and number
                    System.out.print("Enter name: ");
                    String inputName = scanner.nextLine();
                    System.out.print("Enter number: ");
                    String inputNumber = scanner.nextLine();
                    phoneNumberStored.put(inputName, inputNumber);
                    break;
                case "Delete":

                    break;
                case "View":
                    for (Map.Entry<String, String> entry : phoneNumberStored.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        System.out.println(key);
                        System.out.println(value);
                    }
                    break;
            }
            System.out.println("Enter option: ");
            command = scanner.nextLine();
        }
        scanner.close();
    }
}

