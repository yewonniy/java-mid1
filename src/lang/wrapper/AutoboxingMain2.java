package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        // 기본형 -> wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱 (Auto-boxing)

        // wrapper -> primitive
        int unboxedValue = boxedValue; // 오토 언박싱 (Auto-unboxing)


        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
