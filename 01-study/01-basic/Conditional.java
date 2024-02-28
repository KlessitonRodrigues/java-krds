// Receive two numbers and display some comparison between them

public class Conditional {
    public static void main() {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.println("First value");
        String value1 = scan.nextLine();

        System.out.println("Second value");
        String value2 = scan.nextLine();

        sumNumbers(value1, value2);
        concatStrings(value1, value2);
        scan.close();

    }

    public static void sumNumbers(String num1, String num2) {
        try {
            Integer number1 = Integer.parseInt(num1);
            Integer number2 = Integer.parseInt(num2);
            Integer sum = number1 + number2;
            System.out.println("Some of these numbers are: " + sum);
        } catch (Exception e) {
            System.out.println("Can't sum values");
        }
    }

    public static void concatStrings(String str1, String str2) {
        String concat = str1 + str2;
        System.out.println("Concatenation of strings are: " + concat);
    }

}