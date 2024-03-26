package _2024년._3월._21일_31일._26일;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int result = 0;
        for (int i = 0; i < seats.length; i++) {
            result += (Math.abs(seats[i] - students[i]));
        }
        return result;
    }
}
