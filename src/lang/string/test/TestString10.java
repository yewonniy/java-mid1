package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {

        String fruits = "apple,banana,mango";

        String[] fruit = fruits.split(",");
        for (String f : fruit) {
            System.out.println(f);
        }

        String join = String.join("->", fruit);
        System.out.println("joinedString = " + join);
    }
}
