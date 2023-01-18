package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ContactNames_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fistName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String result = fistName + delimiter + lastName;
        System.out.println(result);
    }
}
