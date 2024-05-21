import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
//        m.test27866();
//        m.test2743();
//        m.test9086();
//        m.test11654();
//        m.test11720();
        m.test10809();
    }

    /**
     * @6단계 알파벳 찾기
     */
    private void test10809() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        br.close();
        for(int a = 'a'; a <= 'z'; a++){
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == a){
                    sb.append(i +" ");
                    break;
                }
            }
            sb.append("-1 ");
        }
        System.out.println(sb.toString());
    }

    /**
     * @5단계 숫자의 합
     */
    private void test11720() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String str = br.readLine();
        br.close();
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.print(sum);
    }

    /**
     * @4단계 아스키 코드
     */
    private void test11654() {
        Scanner sc = new Scanner(System.in);
        // char -> int
        System.out.print((int) sc.nextLine().charAt(0));
    }

    /**
     * @3단계 문자열
     */
    private void test9086() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= T; i++){
            char[] str = br.readLine().toCharArray();
            sb.append("" + str[0] + str[str.length - 1] + "\n");
        }
        br.close();
        System.out.print(sb);
    }

    /**
     * @2단계 단어 길이 재기
     */
    private void test2743() {
        Scanner sc = new Scanner(System.in);
        System.out.print(sc.nextLine().length());
    }

    /**
     * @1단계 문자와 문자열
     */
    private void test27866() {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        int i = sc.nextInt();
        System.out.print(str[i - 1]);
    }
}
