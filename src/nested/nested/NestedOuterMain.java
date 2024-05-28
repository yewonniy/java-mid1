package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        NestedOuter.Nested nested = new NestedOuter.Nested();  // new 바깥클래스.중첩클래스()
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
