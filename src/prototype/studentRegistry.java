package prototype;

import builderDP.Student;

import java.util.HashMap;
import java.util.Map;

public class studentRegistry {
    private Map<String, student> m1  =new HashMap<>();

    void register(String key, student val){
        m1.put(key, val);

    }

    student get(String key){
        return m1.get(key).copy();
    }
}
