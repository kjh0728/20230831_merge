package day3;

public class Array {
    public static void main(String[] args) {
        // 배열(Array)

        // 일반 변수
        int normal = 1; //하나의 값과 저장할 수 있다.

        //배열
        // 여러개의 값을 동시에 관리해야 할 때 사용
        // 예시 : 헬스장에 등록한 사람의 이름을 name이라는 이름으로 저장할 시 편하게 사용할 수 있다
        // 선언과 동시에 저장
        int[] arr = {8, 2, 3, 1, 1};    // 우측의 값의 개수를 보고 배열의 크기를 할당
        //따라서 배열의 크기는 5개가 됨

        System.out.println(arr[0]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[2]);
        System.out.println(arr[1]);

        // 먼저 선언하고 나중에 저장
        int[] arr2 = new int[100];  // 우측의 대괄호 안에 크기로 배열의 크기를 할당
        // 따라서 배열의 크기가 100이 됨




    }
}
