import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
//        m.test27866();
//        m.test2743();
//        m.test9086();
//        m.test11654();
//        m.test11720();
//        m.test10809();
//        m.test2675();
//        m.test1152();
//        m.test2908();
//        m.test5622();
        m.test11718();
    }

    /**
     * @11단계 그대로 출력하기
     */
    private void test11718() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * @10단계 다이얼
     */
    private void test5622() throws IOException {
        Map<Integer, String> m = new HashMap<>();
        char c = 'A' - 1;
        for(int i = 2; i <= 9; i++ ){
            String str;
            if(i == 7 || i == 9) {
                str = String.valueOf(++c) + ++c + ++c + ++c;
            } else {
                str = String.valueOf(++c) + ++c + ++c;
            }
            m.put(i, str);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        AtomicInteger time = new AtomicInteger();
        for(int i = 0; i < s.length(); i++){
            String tmp = String.valueOf(s.charAt(i));
            m.forEach((index, s1) -> {
                if(s1.contains(tmp)){
                    time.addAndGet(index + 1);
                }
            });
        }
        br.close();
        System.out.print(time);
    }

    /**
     * @9단계 상수
     */
    private void test2908() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        for(int i = 0; i < str.length; i++){
            str[i] = str[i].substring(2) + str[i].charAt(1) + str[i].charAt(0);
        }
        br.close();
        if(Integer.parseInt(str[0]) > Integer.parseInt(str[1]))
            System.out.print(str[0]);
        else
            System.out.print(str[1]);
    }

    /**
     * @8단계 단어의 개수
     */
    private void test1152() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int count = 0;

        System.out.print(count);
    }

    /**
     * @7단계 문자열 반복
     */
    private void test2675() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++){
            String str = br.readLine();
            int n = Integer.parseInt(str.split(" ")[0]);
            String S = str.split(" ")[1];

            for(int j = 0; j < S.length(); j++){
                String re = String.valueOf(S.charAt(j));
                sb.append(re.repeat(n));
            }
            sb.append("\n");
        }
        br.close();
        System.out.print(sb.toString());
    }

    /**
     * @6단계 알파벳 찾기
     */
    private void test10809() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();
        StringBuilder sb = new StringBuilder();
        // a부터 z까지 문자열 안에 해당 값이 있는지 확인하기
        int i = 0;
        for(int a = 'a'; a <= 'z'; a++){
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == a){
                    sb.append(j + " ");
                    i++;
                    break;
                }
                if(j == str.length() - 1){
                    sb.append(-1 + " ");
                    i++;
                }
            }
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
