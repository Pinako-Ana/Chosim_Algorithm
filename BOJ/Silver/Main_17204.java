package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_17204 {
    static int[] arr;
    static boolean[] check;
    static int count = 1;
    static int K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        K = Integer.parseInt(str[1]);

        arr = new int[N];
        check = new boolean[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dfs(0);

        System.out.println(count);

    }

    private static void dfs(int a){
        if(arr[a] == K) return;
        if(check[a]){
            count = -1;
        }else{
            check[a] = true;
            count++;
            dfs(arr[a]);
        }
    }

}
