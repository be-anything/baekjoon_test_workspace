import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main m = new Main();
//        m.test1330();
//        m.test9498();
//        m.test2753();
        m.test14681();
    }

    /**
     * @4단계 사분면 고르기
     */
    private void test14681() {
        
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