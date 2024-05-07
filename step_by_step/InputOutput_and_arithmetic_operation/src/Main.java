import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
//        m.test10998();
//        m.test1008();
//        m.test10869();
//        m.test10926();
//        m.test18108();
//        m.test10430();
//        m.test2588();
//        m.test11382();
//        m.test10171();
        m.test10172();
    }

    private void test10172() {
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
    }

    private void test10171() {
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }

    /**
     * @11단계
     * int와 long을 구분해서 사용할 줄 알자
     * 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10의 12승)이 공백을 사이에 두고 주어진다.
     */
    private void test11382() {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(a + b + c);
    }

    /**
     * @10단계
     *
     */
    private void test2588() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = 0;
        int tmp = num2;

        for(int i = 0; i < 3; i++){
            int result = num1 * (tmp % 10);
            System.out.println(result);
            tmp /= 10;
            
            // Math.pow는 제곱 구하는 방법
            sum += (int) (result * Math.pow(10, i));
        }
        System.out.println(sum);
    }

    /**
     * @9단계
     * 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
     */
    private void test10430() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println((A + B) % C);
        System.out.println(((A % C) + ( B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }

    /**
     * @8단계
     * 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
     */
    private void test18108() {
        Scanner sc = new Scanner(System.in);
        int diff = 2541 - 1998;
        int _year = sc.nextInt();
        System.out.println(_year - diff);
    }

    /**
     * @7단계
     * 첫째 줄에 준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.
     * nextLine() 사용하기
     */
    private void test10926() {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        System.out.println(id + "??!");
    }

    /**
     * @6단계
     * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
     */
    private void test10869(){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
    }

    /**
     * @5단계
     */
    private void test1008(){
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        System.out.print(A / B);
    }

    /**
     * @4단계
     */
    private void test10998(){
        Scanner sc = new Scanner(System.in);
        System.out.print(sc.nextInt() * sc.nextInt());
    }
}

