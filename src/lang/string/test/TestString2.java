package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int sum = 0;
        for (String string : arr) {
            int length = string.length();
            System.out.printf("%s: %d", string, length);
            System.out.println();
            sum += length;
        }
        System.out.println("sum = "+ sum);

    }
}
