package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int persons = Integer.parseInt(scanner.nextLine());
        int total = num / persons;

        boolean remainder = num % persons != 0;
        if (remainder) {
            total += 1;
        }
        System.out.println(total);
    }
}
