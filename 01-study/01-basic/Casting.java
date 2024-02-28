public class Casting {

    public static void main() {

        double num = 1; // auto int to double

        int num2 = (int) 10.0; // manual double to int

        char char1 = 'A';
        String str = String.valueOf(char1); // char to String
        char char2 = str.charAt(0); // String to char

        String str2 = String.valueOf(num2); // int to String
        int num3 = Integer.parseInt(str2); // String to int
    }
}
