package bj18.id_04;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] count = new int[8001]; 
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
            count[num + 4000]++;
        }

        Arrays.sort(arr);

        int mean = (int) Math.round((double) sum / N);

        int median = arr[N / 2];

        int maxFreq = 0;
        for (int i = 0; i < 8001; i++) {
            if (count[i] > maxFreq) maxFreq = count[i];
        }

        ArrayList<Integer> modes = new ArrayList<>();
        for (int i = 0; i < 8001; i++) {
            if (count[i] == maxFreq) modes.add(i - 4000);
        }

        int mode;
        if (modes.size() == 1) mode = modes.get(0);
        else {
            Collections.sort(modes);
            mode = modes.get(1);
        }

        int range = arr[N - 1] - arr[0];

        bw.write(mean + "\n");
        bw.write(median + "\n");
        bw.write(mode + "\n");
        bw.write(range + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
