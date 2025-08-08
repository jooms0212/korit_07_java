package ch07_loops;
/*
    1 2 3 4 5 6 ... 10
    11 12 13 ... 20
    ...
    91 ... 100

    1. 반복문을 100번 돌리는 방법
    2. 반복문을 10번 돌리는 방법
 */
public class Loop02 {
    public static void main(String[] args) {
        int k = 0;
        while (k < 100) {
            System.out.print(++k + " ");
            if (k % 10 == 0) {
                System.out.println();
            }
        }

        int i = 1;
        while (i < 101) {
            int j = 0;
            while (j <10) {
                System.out.print(i + " ");
                i++;
                j++;
            }
            System.out.println();
        }
        // 두번째 방법
        int p = 1;
        while (p < 101) {
            System.out.println(p + " " + (p + 1)+  " " + (p + 2)+ " " + (p + 3)+ " " +
                    (p + 4)+ " " + (p + 5)+ " " + (p + 6)+ " " + (p + 7)+ " " +
                    (p + 8)+ " " + (p + 9) + " ");
            p += 10;
        }
    }
}
