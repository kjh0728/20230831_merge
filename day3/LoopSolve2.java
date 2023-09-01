package day3;

public class LoopSolve2 {
    public static void main(String[] args) {
        /*
        *
        ***
        *****
       별 모양 그리기
         */

        for(int i = 1; i < 6; i+=2)
        {
            for(int j = 0; j < i; j ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        /*
          *
         ***
        *****
       별 모양 그리기
         */
        int y = 3;
        int lineNum = 1;
        for(int i = 1; i < y*2; i+=2)
        {
            for(int j = 0; j < y - lineNum; j++)
            {
                System.out.print(" ");
            }

            for(int j = 0; j < i; j ++)
            {
                System.out.print("*");
            }
            System.out.println();
            lineNum++;
        }

    }
}
