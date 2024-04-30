package lang.string.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";

        StringBuilder stringBuilder = new StringBuilder(str);
        String string = stringBuilder.reverse().toString();

        System.out.println(string);
    }
}
