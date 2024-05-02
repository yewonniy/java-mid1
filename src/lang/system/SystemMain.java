package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간을 밀리초로 가져온다
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간을 나노초로 가져온다
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수를 읽는다 (운영체제)
        System.out.println("getenv = "+ System.getenv());

        // 시스템 속성을 읽는다 (자바가 사용하는 거)
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version: "+ System.getProperty("java.version"));

        // 배열을 고속으로 복사한다 (운영체제가 하드웨어랑 해줌)
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        // 프로그램 종료 (가급적이면 절대 사용하지 말 것)
        System.exit(0);
    }
}
