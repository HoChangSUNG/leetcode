package _2023년._8월._21일_31일._25일;

public class DesignHashSet {

    private Integer[] arr;

    public DesignHashSet() {
        arr = new Integer[1000001];
    }

    public void put(int key, int value) {
        arr[key] = value;
    }

    public int get(int key) {
        return arr[key] == null ? -1 : arr[key];
    }

    public void remove(int key) {
        arr[key] = null;
    }
}
