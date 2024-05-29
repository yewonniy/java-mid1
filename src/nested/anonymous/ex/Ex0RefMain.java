package nested.anonymous.ex;

public class Ex0RefMain {

    public static void main(String[] args) {

        Printer print = new Printer() {

            @Override
            public void hello(String s) {
                System.out.println("프로그램 시작");
                System.out.println("Hello " + s);
                System.out.println("프로그램 종료");
            }
        };

        print.hello("java");
        print.hello("spring");
    }
}
