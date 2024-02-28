import java.lang.System;

public class HelloWorld {
    public static void main() {
        var text1 = "Hello";
        var text2 = "World!";
        var fullText = text1 + " " + text2;
        int index = 0;

        // printf can use %s %d to replace logging string.
        // println log in a new line.
        System.out.printf("%s %d\n", fullText, index);
        System.out.printf("%s %d\n", fullText, ++index);
        System.out.printf("%s %d\n", fullText, ++index);
        System.out.printf("%s %d\n", fullText, ++index);
        System.out.printf("%s %d\n", fullText, ++index);
    }
}
