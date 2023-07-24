package _7월._21일_31일._24일;

public class DesignHashMap {
    private Object[] table;

    public DesignHashMap() {
        table = new Object[1000001];
    }

    public void put(int key, int value) {
        table[key] = value;
    }

    public int get(int key) {
        return table[key] == null ? -1 : (Integer) table[key];
    }

    public void remove(int key) {
        table[key] = null;
    }
}
