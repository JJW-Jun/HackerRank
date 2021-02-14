package demo.book.coderefactoring.chapter2.badcode.simpledatabase.after;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabase {
    private Map<String, String> _map = new HashMap<String, String>();

    public SimpleDatabase(Reader r) throws IOException {
        BufferedReader reader = new BufferedReader(r);
        while (true) {
            // 한 줄 읽고 return
            String line = reader.readLine();

            // 빈 줄이면 반복문 종료
            if (line == null) { break; }

            // "=" 의 위치를 찾는 메서드
            int equalIndex = line.indexOf("=");

            if (equalIndex > 0) {
                String key = line.substring(0, equalIndex);
                String value = line.substring(equalIndex + 1, line.length());
                _map.put(key, value);
            }
        }
    }

    public void putValue(String key, String value) { _map.put(key, value); }
    public String getValue(String key) { return _map.get(key); }
    public Iterator<String> iterator() { return _map.keySet().iterator(); }

}