package _2024년._2월._11일_20일._19일;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int finishCount = 0;
        int[] degree = new int[numCourses];
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            adjList.get(prerequisite[1]).add(prerequisite[0]);
            degree[prerequisite[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == 0) queue.add(i);
        }
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            finishCount++;
            for (int adj : adjList.get(cur)) {
                degree[adj]--;
                if (degree[adj] == 0) queue.add(adj);
            }
        }
        return finishCount == numCourses;
    }
}
