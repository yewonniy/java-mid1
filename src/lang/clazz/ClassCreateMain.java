package lang.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {
//         Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello");
        System.out.println("helloClass = " + helloClass);

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("hello = "+ hello);
        System.out.println("result = " + result);
    }
}
