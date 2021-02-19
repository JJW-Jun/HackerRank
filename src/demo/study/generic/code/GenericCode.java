package demo.study.generic.code;

import demo.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class GenericCode {


    Person person = new Person();

    private static void doCoding(List<?> person) {
        person.forEach(e -> {
            System.out.println("Test");
        });
    }
    Map hashMap = new HashMap();



//    private static <T extends Number & Comparable & Serializable> List<T> from{
//
//    }

    public interface Comparable<T> {
        public int compareTo(T arg);
    }

    public class TreeMap<Key extends Comparable<Key>, Data> {
        private class Entry<K, V> {
            K key;
            V value;
            Entry<K, V> left = null;
            Entry<K, V> right = null;
            Entry<K, V> parent;
        }

        private transient Entry<Key, Data> root = null;

        private Entry<Key, Data> getEntry(Key key) {
            Entry<Key, Data> p = root;
            Key k = key;
            while (p != null) {
                int cmp = k.compareTo(p.key);
                if (cmp == 0)
                    return p;
                else if (cmp < 0)
                    p = p.left;
                else
                    p = p.right;
            }
            return null;
        }

        public boolean containsKey(Key key) {
            return getEntry(key) != null;
        }

    }
}