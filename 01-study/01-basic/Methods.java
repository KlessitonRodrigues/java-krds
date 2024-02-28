public class Methods {
    String str = "test1"; // non-static
    static String str2 = "test2"; // static

    static void main() {
        System.out.println(str2);
    }

    // non-static
    void printString() {
        System.out.println(str);
    }

    // static
    static void printStaticString() {
        System.out.println(str2);
    }
}
