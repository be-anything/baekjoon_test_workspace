import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main m = new Main();
//        m.test1330();
//        m.test9498();
//        m.test2753();
//        m.test14681();
//        m.test2884();
//        m.test2525();
        m.test2480();
    }

    /**
     * @7단계 주사위 세개
     */
    private void test2480() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int result = 0;
        if(num1 != num2 && num2 != num3 && num1 != num3){
            int max = Math.max(num1, num2);
            max = Math.max(num3, max);
            result = max * 100;
        } else if(num1 == num2 && num2 == num3) {
            result = 10000 + num1 * 1000;
        } else {
            if(num1 == num2) {
                result = 1000 + num1 * 100;
            } else {
                result = 1000 + num3 * 100;
            }
        }
        System.out.println(result);
    }

    /**
     * @6단계 오븐시계
     *
     */
    private void test2525() {
        Scanner sc = new Scanner(System.in);
        int nowH = sc.nextInt();
        int nowM = sc.nextInt();
        int time = sc.nextInt();

        int newM = time + nowM;
        if(newM >= 60) {
            int tmpH = newM / 60;
            int newH = nowH + tmpH;
            newM %= 60;

            if(newH >= 24) {
                System.out.println((newH - 24) + " " + newM);
            }
            else {
                System.out.println(newH + " " + newM);
            }
        } else {
            System.out.println(nowH + " " + newM);
        }
    }

    /**
     * @5단계 알람시계
     *
     */
    private void test2884() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M >= 45){
            System.out.println(H + " " + (M - 45));
        } else {
            // 현재 분이 45분보다 작을 때
            int newH = H - 1;
            int newM = 60 + (M - 45);
            if(H == 0) {
                newH = 24 - 1;
            }
            System.out.println(newH + " " + newM);
        }
    }

    /**
     * @4단계 사분면 고르기
     */
    private void test14681() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > 0){
            System.out.print(y > 0 ? "1" : y < 0 ? "4" : "");
        } else if (x < 0){
            System.out.print(y > 0 ? "2" : y < 0 ? "3" : "");
        }
    }

    /**
     * @3단계 윤년
     * 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
     * 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
     */
    private void test2753() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            System.out.println(1);
        else
            System.out.println(0);
    }

    /**
     * @2단계 시험 성적
     * 시험 점수를 입력받아
     * 90 ~ 100점은 A,
     * 80 ~ 89점은 B,
     * 70 ~ 79점은 C,
     * 60 ~ 69점은 D,
     * 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
     */
    private void test9498() {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80){
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if(score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    /**
     * @1단계 두 수 비교하기
     */
    private void test1330() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String result = A > B ? ">" : (A < B ? "<" : "==");
        System.out.println(result);
    }
}
