import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
//        m.test5597();
//        m.test3052();
        m.test10811();
//        m.test1546();
    }

    /**
     * @10단계 평균
     */
    private void test1546() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double sum = 0.0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] nums = new int[N];
        int max = 0;
        int i = 0;
        while (st.hasMoreTokens()){
            nums[i] = Integer.parseInt(st.nextToken());
            if(i == 0){
                max = nums[i];
            } else {
                if (max < nums[i]) {
                    max = nums[i];
                }
            }
            i++;
        }
        for(int j = 0; j < N; j++){
            sum += (((double) nums[j] / max) * 100);
        }
        System.out.print(sum / N);
    }

    /**
     * @9단계 바구니 뒤집기
     */
    private void test10811() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp = br.readLine();
        int N = Integer.parseInt(tmp.split(" ")[0]);
        int M = Integer.parseInt(tmp.split(" ")[1]);
        int[] arr = new int[N];
        for(int i = 0 ; i < N; i++){
            arr[i] = i + 1;
        }
        // 위치 역순으로 바꾸기
        StringTokenizer st;
        for(int a = 1; a <= M; a++){
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            if(i != j){
                for(int b = i; b < j; b++){
                    int _tmp = arr[j];
                    arr[j] = arr[b];
                    arr[b] = _tmp;
                    i++;
                    j--;
                }
            }
        }
        br.close();
        for(int num: arr){
            System.out.print(num + " ");
        }
    }

    /**
     * @8단계 나머지
     */
    private void test3052() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] tmp = new int[10];
        int B = 42;
        for(int i = 0; i < tmp.length; i++){
            tmp[i] = Integer.parseInt(br.readLine()) % B;
        }
        br.close();
        int[] arr = Arrays.stream(tmp).distinct().toArray();
        System.out.print(arr.length);
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
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 30; i++){
            int count = 0;
            for(int j : arr){
                if(i != j)
                    count++;
            }
            if(count == arr.length)
                sb.append(i + " ");
        }
        String[] nums = sb.toString().split(" ");
        if(Integer.parseInt(nums[0]) > Integer.parseInt(nums[1])) {
            String tmp = nums[0];
            nums[0] = nums[1];
            nums[1] = tmp;
        }
        System.out.print(nums[0] + "\n" + nums[1]);
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
