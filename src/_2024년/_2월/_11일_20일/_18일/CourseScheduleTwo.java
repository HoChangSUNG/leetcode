package _2024년._2월._11일_20일._18일;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleTwo {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] order = new int[numCourses];
        int[] degree = new int[numCourses];
        int index = 0;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] prequisite : prerequisites) {
            adjList.get(prequisite[1]).add(prequisite[0]);
            degree[prequisite[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (degree[i] == 0) {
                queue.add(i);
            }
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
