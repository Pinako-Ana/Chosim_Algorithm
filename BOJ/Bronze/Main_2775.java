package BOJ.Bronze;

import java.io.*;

public class Main_2775 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long[][] arr = new long[15][15];

        for (int i = 1; i < 15; i++) {
            arr[0][i] = i;
            arr[i][1] = 1;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }
        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            int k = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            sb.append(arr[k][N]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
