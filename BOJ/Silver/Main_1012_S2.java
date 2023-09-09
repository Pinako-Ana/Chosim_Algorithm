package BOJ.Silver;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main_1012_S2 {
    static boolean[][] map;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int M, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] info = br.readLine().split(" ");

            M = Integer.parseInt(info[0]);
            N = Integer.parseInt(info[1]);
            int K = Integer.parseInt(info[2]);

            int count = 0;

            map = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                String[] posi = br.readLine().split(" ");
                map[Integer.parseInt(posi[1])][Integer.parseInt(posi[0])] = true;
            }

            for (int j = 0; j < N; j++) {
                for (int l = 0; l < M; l++) {
                    if (map[j][l]) {
                        bfs(j, l);
                        count++;
                    }
                }
            }

            sb.append(count).append("\n");

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static void bfs(int j, int l) {
        Queue<Node> myQ = new LinkedList<>();
        myQ.offer(new Node(j, l));
        map[j][l] = false;

        while (!myQ.isEmpty()) {
            Node cur = myQ.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || ny < 0 || nx == N || ny == M) continue;

                if (map[nx][ny]) {
                    map[nx][ny] = false;
                    myQ.offer(new Node(nx, ny));
                }

            }

        }

    }

    private static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return x + ", " + y;
        }
    }
}
