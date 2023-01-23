package DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        boolean opening = false;
        boolean closing = false;
        boolean balanced = false;

        for (int i = 1; i <= num; i++) {
            String input = scanner.nextLine();
            if (input.charAt(0) == ')') {
                if (!opening) {
                    balanced = true;
                } else {
                    closing = true;
                    opening = false;
                }
            }
            if (input.charAt(0) == '(') {
                if (opening) {
                    balanced = true;
                } else {
                    if (closing) {
                        closing = false;
                    }
                    opening = true;
                }
            }
        }
        if (balanced || opening) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
