import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
//        m.test25083();
//        m.test3003();
        m.test2444();
    }
    /**
     * @3단계 별 찍기 - 7
     */
    private void test2444() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        int max = 2 * N - 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= max; i++){
            // 공백은 4 3 2 1
            for(int j = N - 1 ; j > N; j--){
            }
            for(int n = 0; n < N; n++){
                sb.append("*");
            }
        }
    }

    /**
     * @2단계 킹, 퀸, 룩, 비숍, 나이트, 폰
     */
    private void test3003() throws IOException {
        int[] arr = {1, 1, 2, 2, 2, 8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i] - Integer.parseInt(tmp[i]) + " ");
        }
        System.out.print(sb.toString());
        br.close();
    }

    /**
     * @1단계 새싹
     * java11에서는 """ """ 사용불가
     */
    private void test25083() {
        System.out.print("         ,r'\"7\n" +
                "r`-_   ,'  ,/\n" +
                " \\. \". L_r'\n" +
                "   `~\\/\n" +
                "      |\n" +
                "      |");
    }
}
