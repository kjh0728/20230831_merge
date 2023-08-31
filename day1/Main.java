package day1;

public class Main {
    public static void main(String[] args) {

        // 숫자 출력
        System.out.println(100);

        // 문자 출력
        System.out.println("hello world!");

        
        // 자료형이 다르면 결과값이 다름
        System.out.println(100+100);
        System.out.println("100"+"100");


        String[] name = {"정다희", "김주현", "오감자"};

        for(int i = 0; i< name.length; i++)
        {
            System.out.print(name[i] + " ");
        }
        System.out.println("오래오래 행복하게");

        for(int i = 0; i< 5; i++)
        {
            System.out.println("안녕하세요 저는 홍길동입니다");
        }
    }
}
