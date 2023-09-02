package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.compare;

public class BOJ_2562_B3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Node> myList = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            myList.add(new Node(num, i + 1));
        }

        myList.sort((o1, o2) -> compare(o2.number, o1.number));

        System.out.println(myList.get(0).number);
        System.out.println(myList.get(0).seq);

    }

    static class Node {
        int number;
        int seq;

        public Node(int number, int seq) {
            this.number = number;
            this.seq = seq;
        }
    }


}
