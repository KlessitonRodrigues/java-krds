// Scan values to different variable types

public class ScanText {
    public static void main() {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.println("Insert a String");
        String num1 = scan.nextLine();

        System.out.println("Insert a integer");
        int num2 = scan.nextInt();

        System.out.println("Insert a long");
        long num3 = scan.nextLong();

        System.out.println("Insert a float");
        float num4 = scan.nextFloat();

        System.out.println("Insert a boolean");
        boolean num5 = scan.nextBoolean();

        System.out.println("Insert a double");
        double num6 = scan.nextDouble();

        scan.close();

        String[] numArr = new String[] { num1, "" + num2, "" + num3, "" + num4, "" + num5, "" + num6 };

        System.out.println(String.join(", ", numArr));
    }
}