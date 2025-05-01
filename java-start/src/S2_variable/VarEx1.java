package S2_variable;

public class VarEx1 {
    public static void main(String[] args) {
        /*
        변수 num1, num2를 활용 한번에 변경

        System.out.println(4 + 3);
        System.out.println(4 - 3);
        System.out.println(4 * 3);
        */

        int num1 = 4;
        int num2 = 3;
        // int num1, num2 = 4, 3; 이런 형태는 불가능
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
    }
}
