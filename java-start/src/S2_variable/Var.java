// 반드시 패키지를 맞춰 주어야 함
package S2_variable;

public class Var {
    public static void main(String[] args) {
        int a; // 변수 설정
        a = 10; // 변수 초기화 -> 처음으로 값 설정
        System.out.println(a);
        a = 50; // 변수 값 변경
        System.out.println(a);

        char c = 'A'; //''는 char
        String e = "Hello Wolrd"; //""는 string

        // 정수
        byte b;
        short s;
        int i;
        long l = 123413541351L; //소문자도 가능

        // 실수
        float f = 3.12414F; //소문자도 가능
        double d = 2.1;
        // long과 float 모두 임시적으로 int, double 타입으로 저장 -> 그러나 두 타입의 범위를 넘는 경우 / 또는 해석의 차이로 에러가 발생
        // 따라서 F와 L로 명시적으로 공간을 적용해주어야 함
    }
}
