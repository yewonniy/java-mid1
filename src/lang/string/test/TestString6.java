package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
//        int i = -1;
//        while (true) {
//            i = str.indexOf(key, i+1);
//            if (i < 0 || i >= str.length()) break;
//            count += 1;
//        }

        int index = str.indexOf(key); // 못찾으면 -1 을 반환함!
        while (index >= 0) {
            index = str.indexOf(key, index+1);
            count++;
        }
        System.out.println("count = " + count);
    }
}
