package day3;

public class LoopSolve {
    public static void main(String[] args) {

        // 2단만
        for(int j = 1; j < 10; j++) {
            System.out.print("2 X" + j + "=" + 2 * j + "\t");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // 일렬로 구구단 전체
        for (int i = 1; i < 10; i++)
        {
            for(int j = 1; j < 10; j++)
            {
                System.out.println(i + "X" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // 가로로 정렬
        for (int i = 1; i < 10; i++)
        {
            for(int j = 1; j < 10; j++)
            {
                System.out.print(j + "X" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // 짝수만
        for (int i = 1; i < 10; i++)
        {
            for(int j = 1; j < 10; j++)
            {
                if(j%2 == 0) {
                    System.out.print(j + "X" + i + "=" + i * j + "\t");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();


        // 변수를 활용한 for문
        int n = 4;
        int m = 20;
        int limit = 10;

        for (int i = 1; i < limit; i++)
        {
            for(int j = n; j < m; j++)
            {
                if(i*j > 99)
                {
                    System.out.print(j + "X" + i + "=" + i * j + "\t");
                }
                else {
                    System.out.print(j + "X" + i + "=" + i * j + "\t\t");

                }
            }
            System.out.println();
        }

    }
}
