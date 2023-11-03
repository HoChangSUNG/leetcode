package _11월._1일_10일._3일;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] degree = new int[numCourses];
        List<List<Integer>> adjList = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            adjList.get(pre[1]).add(pre[0]);
            degree[pre[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (degree[i] == 0) queue.offer(i);
        }
        int visitedCount = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            visitedCount++;

            for (int adj : adjList.get(node)) {
                degree[adj]--;
                if (degree[adj] == 0) {
                    queue.offer(adj);
                }
            }
        }
        return visitedCount == numCourses;
    }
}
