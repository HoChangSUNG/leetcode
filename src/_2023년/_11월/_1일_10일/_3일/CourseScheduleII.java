package _2023년._11월._1일_10일._3일;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] degree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            degree[pre[0]]++;
            adjList.get(pre[1]).add(pre[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (degree[i] == 0) {
                queue.offer(i);
            }
        }
        int visited = 0;
        int[] result = new int[numCourses];
        while (!queue.isEmpty()) {
            int node = queue.poll();
            result[visited++] = node;
            for (int adj : adjList.get(node)) {
                degree[adj]--;
                if (degree[adj] == 0) queue.add(adj);
            }
        }
        if (visited == numCourses) return result;
        return new int[0];
    }
}
