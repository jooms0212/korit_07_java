package ch00_review.test;

import java.util.*;

public class MapList {

    public static void main(String[] args) {
        List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("rating", "vip");
        map.put("age", 30);
        customers.add(map);

        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", "김기영");
        map1.put("rating", "gold");
        map1.put("age", 35);
        customers.add(map1);

        for (Map<String, Object> customer : customers) {
            for (Map.Entry<String, Object> entry : customer.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                System.out.println(key + "=" + value);
            }
        }
    }
}
