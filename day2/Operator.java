package day2;

public class Operator {
    public static void main(String[] args) {
        //산술연산사
        System.out.println(10+20);
        System.out.println(10-20);
        System.out.println(10*20);

        //나누기 할 때 주의할 점
        //나누기 할 때 -> 정수/정수 = 정수
        // 컴퓨터는 정수끼리, 실수끼리 계산 가능(1, 1.0은 완전 다른 수)
        // int : 정수, double : 넓은 실수(소수), float : 좁은 실수(소수), String : 문자열, char : 한글자 문자
        System.out.println(10/20); // 정수와 정수로 나눴기 때문에 0.5(소수)가 아니라 0.5의 정수부분인 0이 출력
        System.out.println(1/2); // 정수와 정수로 나눴기 때문에 0.5(소수)가 아니라 0.5의 정수부분인 0이 출력

        int i = 10;
        double d = 10.0;
        float f = 10.0F;
        String str = "홍길동";
        char c = 'A';

        //나눗셈의 나머지
        //배수, 짝수 구할 때 사용하는 등 사용범위가 은근 있음
        System.out.println(2%1);

        //비교 연산자(결과는 boolean 변수 - true(참), false(거짓)으로 출력됨)
        System.out.println(10>5); // >, <  : 초과, 미만
        System.out.println(10<5);
        System.out.println(10>=5); // >=, =< : 이상, 이하
        System.out.println(10<=5);
        System.out.println(10==5); // == : 같다
        System.out.println(10!=5); // != : 같지 않다

        //boolean 변수 = 논리값(참,거짓)을 나타내는 변수
        System.out.println(true);
        System.out.println(false);


        // 증감연산자 : 증가하고 감소하는 연산자
        int num = 10; // num 은 10이다.
        System.out.println(num + 10); // 20이 출력되지만 num의 값은 바뀌지 않는다

        //여기서 num의 값은 무엇인가? 10이다.
            //이유 : 출력문에서 더해서 출력했을 뿐 num에 값을 넣지 않았다.
        System.out.println(num); // 따라서 10이 출력된다.


        // 우측을 보면 num에 10을 (+)더해 (=)기호를 이용하여 좌측에 num에 "대입"하였기에 num에 값은 증가한다.
        // 따라서 기존 10이었던 num은 10이 증가하여 20이 된다.
        num = num + 10;
        System.out.println(num); // 20이 출력된다.

        // 우측을 보면 num에 5를 (-)빼 (=)기호를 이용하여 좌측에 num에 "대입"하였기에 num에 값은 감소한다.
        // 따라서 기존 20이었던 num은 5가 감소하여 15가 된다.
        num = num - 5;
        System.out.println(num); // 15가 출력된다.

        num += 10; // num = num + 10; 과 같은 계산을 한다.
        // 따라서 기존 15였던 num에 10이 증가하여 25가 된다.
        System.out.println(num); // 25가 출력된다.

        num -= 5; // num = num - 5; 와 같은 계산을 한다.
        // 따라서 기존 25였던 num이 5 감소하여 20이 된다.
        System.out.println(num); // 20이 출력된다.


        // 우측을 보면 num에 2을 (/)나누어서 (=)기호를 이용하여 좌측에 num에 "대입"하였기에 num에 값은 나눠진다.
        // 따라서 기존 10이었던 num은 2로 나누어져 10이 된다.
        num = num / 2;
        System.out.println(num); // 10이 출력된다.

        num /= 2; // num = num / 2; 와 같은 계산을 한다.
        //따라서 기존 10이었던 num이 2로 나누어져 5가 된다.
        System.out.println(num); // 5가 출력된다.


        // 우측을 보면 num에 2을 (*)곱해 (=)기호를 이용하여 좌측에 num에 "대입"하였기에 num에 값은 곱해진다.
        // 따라서 기존 5이었던 num은 2로 곱해져서 10이 된다.
        num = num * 2;
        System.out.println(num); // 10이 출력된다.

        num *= 2; // num = num * 2; 와 같은 계산을 한다.
        //따라서 기존 10이었던 num이 2로 곱해져 20이 된다.
        System.out.println(num); // 20이 출력된다.


        //그 외 증가 연산자
        num++; // num = num + 1; 과 같다

        //그 외 감소 연산자
        num --; // num = num - 1;과 같다

    }
}
