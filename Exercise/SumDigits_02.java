package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String num = String.valueOf(n);
        int sum = 0;

        for (int i = 0; i <= num.length() - 1; i++) {
            char current = num.charAt(i);
            int currentNum = Integer.parseInt(String.valueOf(current));
            sum += currentNum;
        }
        System.out.println(sum);
    }
}
