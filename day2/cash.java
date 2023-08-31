package day2;

public class cash {
    public static void main(String[] args) {
        int[] cash = {15000, 10000, 20000, 25000, 30000, 1000};

        for(int i = 0; i < cash.length; i++)
        {
            System.out.println(i+1 + "번째 사람이 갖고 있는 돈 :" + cash[i]);

            /////////////////////////////////
            if(cash[i] > 20000)
            {
                System.out.println("치킨 살 수 있다!!"); // 이 코드를 실행하여 포카칩이 출력된다.
            }
            ////////////////////////////////
            System.out.println();
        }
    }
}
