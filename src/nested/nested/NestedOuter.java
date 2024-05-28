package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue=2;

    static class Nested {
        private int nestedInstaceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstaceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근
//            System.out.println(outInstanceValue);  => 당연히 불가!!

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private이어도 접근 가능!
            System.out.println(outClassValue);
        }
    }
}
