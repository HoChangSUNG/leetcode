package _2023년._7월._21일_31일._25일;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestDistanceToACharacter {
    private int[] di = {-1, 1};

    public int[] shortestToChar(String s, char c) {
        List<Integer> start = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                start.add(i);
            }
        }
        boolean[] visited = new boolean[s.length()];
        Queue<Integer> q = new LinkedList<>();
        int[] result = new int[s.length()];
        for (int st : start) {
            q.add(st);
            visited[st] = true;
        }
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int i = 0; i < 2; i++) {
                int next = cur + di[i];
                if (next < 0 || next >= s.length() || visited[next]) continue;
                result[next] = result[cur] + 1;
                visited[next] = true;
                q.add(next);
            }
        }
        return result;
    }
}
