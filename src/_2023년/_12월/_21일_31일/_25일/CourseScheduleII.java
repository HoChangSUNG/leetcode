package _2023년._12월._21일_31일._25일;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] order = new int[numCourses];
        int[] degree = new int[numCourses];
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            degree[pre[0]]++;
            adjList.get(pre[1]).add(pre[0]);
        }

        int index = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == 0) queue.add(i);
        }

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            order[index++] = cur;

            for (int adj : adjList.get(cur)) {
                degree[adj]--;
                if (degree[adj] == 0) queue.add(adj);
            }
        }
        return index == numCourses ? order : new int[0];
    }
}
