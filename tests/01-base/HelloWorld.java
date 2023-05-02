import java.lang.System;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(JoinWords(args));
    }

    public static String JoinWords(String[] args) {
        return Hello(args) + " " + World(args);
    }

    public static String Hello(String[] args) {
        return "Hello";
    }

    public static String World(String[] args) {
        return "World! 2";
    }
}
