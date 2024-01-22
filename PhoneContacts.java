import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class phoneContacts {
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
        String input = scanner.nextLine();
        //LinkedHashMap where I will keep my phone numbers
        LinkedHashMap<String, Integer> phoneNumberStored = new LinkedHashMap<>();
        //New input for the loop
        String command = scanner.nextLine();
        //While loop for the command (input)
        while (!command.equals("call")) {
            switch (command) {
                case "Add":
                    phoneNumberStored.put(input, inputPhoneNumber);
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : phoneNumberStored.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key);
            System.out.println(value);

        }
    }
}
