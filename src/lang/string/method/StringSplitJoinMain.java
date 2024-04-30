package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split()
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        // join()
        String join = String.join("-", "A", "b", "c");
        System.out.println("연결된 문자열 = "+ join);

        // 문자열 배열 연결
        String result = String.join("-", split);
        System.out.println("result = "+ result);
    }
}
