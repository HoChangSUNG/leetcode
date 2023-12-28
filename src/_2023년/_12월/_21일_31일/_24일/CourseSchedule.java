package _2023년._12월._21일_31일._24일;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] degree = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int[] pre = prerequisites[i];
            degree[pre[0]]++;
            adj.get(pre[1]).add(pre[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        int visited = 0;
        for (int i = 0; i < numCourses; i++) {
            if (degree[i] == 0) {
                queue.add(i);
                visited++;
            }
        }

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int i = 0; i < adj.get(cur).size(); i++) {
                int adjNode = adj.get(cur).get(i);
                degree[adjNode]--;
                if (degree[adjNode] == 0) {
                    queue.add(adjNode);
                    visited++;
                }
            }
        }
        return visited == numCourses;
    }
}
