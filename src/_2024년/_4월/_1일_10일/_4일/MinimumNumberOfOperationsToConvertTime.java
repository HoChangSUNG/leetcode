package _2024년._4월._1일_10일._4일;

public class MinimumNumberOfOperationsToConvertTime {
    public int convertTime(String current, String correct) {
        int minutes = convert(correct) - convert(current);
        int[] min = new int[]{60, 15, 5, 1};
        int result = 0;
        while (minutes != 0) {
            for (int i = 0; i < min.length; i++) {
                while (minutes >= min[i]) {
                    minutes -= min[i];
                    result += 1;
                }
            }
        }
        return result;
    }

    private int convert(String time) {
        String[] splitted = time.split(":");
        int minutes = 0;
        minutes += (60 * Integer.valueOf(splitted[0]));
        minutes += Integer.valueOf(splitted[1]);
        return minutes;
    }
}
