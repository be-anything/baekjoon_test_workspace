import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
//        m.test2739();
//        m.test10950();
//        m.test8393();
//        m.test25304();
//        m.test25314();
//        m.test15552();
//        m.test11021();
//        m.test11022();
//        m.test2438();
//        m.test2439();
//        m.test10952();
        m.test10951();
    }

    /**
     * @12단계 A+B-4
     * EOF End Of File
     *  - 데이터 소스로부터 더 이상 읽을 수 있는 데이터가 없을 때.
     *
     */
    private void test10951() {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            String input = "";
            StringBuilder sb = new StringBuilder();
            while ((input = br.readLine()) != null && !input.isEmpty()){
                String[] nums = input.split(" ");
                sb.append(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]) + "\n");
            }
            System.out.print(sb.toString());
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    /**
     * @11단계 A+B-5
     */
    private void test10952() {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            while(true){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if(a == 0 && b == 0)
                    break;
                bw.write(a + b + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @10단계 별찍기 - 2
     */
    private void test2439() {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int N = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i <= N; i++) {
                for(int j = N; j >= 1; j--) {
                    if (j <= i) {
                        sb.append("*");
                    } else {
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    /**
     * @9단계 별찍기 - 1
     */
    private void test2438() {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int N = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i <= N; i++ ) {
                for(int j = 1; j <= i; j++)
                    sb.append("*");
                sb.append("\n");
            };
            System.out.print(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @8단계 A+B-8
     */
    private void test11022() {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int T = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i <= T; i++){
                String[] nums = br.readLine().split(" ");
                int result = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
                sb.append("Case #" + i +": " + nums[0] + " + " + nums[1] + " = " + result + "\n");
            }
            System.out.print(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @7단계 A+B-7
     */
    private void test11021() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            int T = Integer.parseInt(br.readLine());
            for(int i = 1; i <= T; i++) {
                String[] nums = br.readLine().split(" ");
//                int result = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
                int result = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
                sb.append("Case #" + i + ": " + result + "\n");
            }
            System.out.print(sb.toString());
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @6단계 빠른 A+B
     */
    private void test15552() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int T = Integer.parseInt(br.readLine());
            for(int i = 0; i < T; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                bw.write(a + b + "\n");
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @5단계 코딩은 체육과목입니다.
     */
    private void test25314() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N / 4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }

    /**
     * @4단계 영수증
     */
    private void test25304() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();

        int total = 0;
        for(int i = 1; i <= N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            total += a * b;
        }
        System.out.println(X == total ? "Yes" : "No");
    }

    /**
     * @3단계 합
     */
    private void test8393() {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= count; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    /**
     * @2단계 A+B-3
     */
    private void test10950() {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 0; i < count; i++) {
            int result = sc.nextInt() + sc.nextInt();
            System.out.println(result);
        }
    }

    /**
     * @1단계 구구단
     */
    private void test2739() {
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }
    }
}
