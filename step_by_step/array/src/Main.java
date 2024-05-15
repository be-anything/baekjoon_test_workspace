import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
//        m.test10807();
//        m.test10871();
//        m.test10818();
//        m.test2562();
//        m.test10810();
//        m.test10813();
        m.test5597();
    }

    /**
     * @7단계 과제 안내신 분?
     */
    private void test5597() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[28];
        for(int i = 1; i <= 28; i++){
            arr[i - 1] = Integer.parseInt(br.readLine());
        }
        br.close();
        int[] result = new int[]{0, 0};
        for(int i = 1; i <= 30; i++){
            for(int j: arr){
                if(j == i) break;
            }
            
        }
        for(int i : result){
            System.out.print(i + " ");
        }
    }

    /**
     * @6단계 공 바꾸기
     */
    private void test10813() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int N = Integer.parseInt(nums[0]);
        int M = Integer.parseInt(nums[1]);

        // 바구니 갯수크기만한 배열 생성
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = i + 1;
        }
        StringTokenizer st;
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken()) - 1;
            int second = Integer.parseInt(st.nextToken()) - 1;

            int tmp = arr[first];
            arr[first] = arr[second];
            arr[second] = tmp;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
        br.close();
    }

    /**
     * @5단계 공 넣기
     */
    private void test10810() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int N = Integer.parseInt(nums[0]);
        int M = Integer.parseInt(nums[1]);
        int[] arr = new int[N];

        // M행마다 반복하기
        StringTokenizer st;
        for(int i = 1; i <= M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            for(int j = start; j <= end; j++){
                arr[j - 1] = num;
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    /**
     * @4단계 최댓값
     */
    private void test2562() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0, n = 0;
        for(int i = 1; i <= 9; i++){
            int num = Integer.parseInt(br.readLine());

            if(i == 1) {
                max = num;
                // 최댓값이 첫번째에 있을 때 실패하게됨
                n = i;
            }
            else if(max < num){
                max = num;
                n = i;
            }
        }
        System.out.printf("%d\n%d", max, n);
        br.close();
    }

    /**
     * @3단계 최소, 최대
     */
    private void test10818() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int first = Integer.parseInt(st.nextToken());
        int min = first;
        int max = first;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(min > num)
                min = num;
            else if (max < num)
                max = num;
        }
        System.out.print(min + " " + max);
        br.close();
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
