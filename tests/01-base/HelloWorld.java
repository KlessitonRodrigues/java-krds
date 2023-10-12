import java.lang.System;

public class HelloWorld {
    public static void main(String[] args) {
        var text1 = "Hello";
        var text2 = "World!";
        var fullText = text1 + " " + text2;
        int index = 0;

        System.out.printf("%s %d\n", fullText, index);
        System.out.printf("%s %d\n", fullText, ++index);
        System.out.printf("%s %d\n", fullText, ++index);
        System.out.printf("%s %d\n", fullText, ++index);
        System.out.printf("%s %d\n", fullText, ++index);
    }
}
