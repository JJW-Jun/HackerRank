package demo.study.generic.example1;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        boolean keyCompare, valueCompare;
        keyCompare = p1.getKey().equals(p2.getKey());
        valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }


    public static void main(String args []){

    }
}
