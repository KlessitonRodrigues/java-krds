// Receive two numbers and display some comparison between them

public class Conditional {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.println("First value");
        String value1 = scan.nextLine();

        System.out.println("Second value");
        String value2 = scan.nextLine();

        sumNumbers(value1, value2);
        scan.close();

    }

    public static Integer sumNumbers(String num1, String num2) {
        try {
            Integer number1 = Integer.parseInt(num1);
            Integer number2 = Integer.parseInt(num2);
            Integer sum = number1 + number2;
            System.out.println("Some of thow numbers: " + sum);
        } catch (Exception e) {
            System.out.println("Can't sum values");
        }
        return 0;
    }
}
