package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@email.com";

        String[] split = email.split("@");
        String id = split[0];
        String domain = split[1];

        System.out.println("ID: "+ id);
        System.out.println("Domain: "+ domain);
    }
}
