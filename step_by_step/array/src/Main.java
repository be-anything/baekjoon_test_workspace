import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
//        m.test10807();
        m.test10871();
    }

    /**
     * @2단계 X보다 작은수
     */
    private void test10871() {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int X = Integer.parseInt(br.readLine().split(" ")[1]);
            StringTokenizer tmp = new StringTokenizer(br.readLine(), " ");
            StringBuilder sb = new StringBuilder();
            while(tmp.hasMoreTokens()){
                int num = Integer.parseInt(tmp.nextToken());
                if(num < X )
                    sb.append(num + " ");
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @1단계 개수 세기
     */
    private void test10807() {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            br.readLine();
            String[] arr = br.readLine().split(" ");
            String num = br.readLine();

            int c = 0;
            for(String n: arr){
                if(num.equals(n))
                    c++;
            }
            System.out.print(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
