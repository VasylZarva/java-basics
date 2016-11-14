package com.epom.collections;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Vasyl Zarva.
 */
public class MainMap {

    public static void main(String[] args) {
        final Map<Integer, Serializable> map = new HashMap<>();
        map.put(5, "abc");
        map.put(2, "sdf");
        map.put(3, new ToCompare(1, "asdf", 3));
        map.put(4, 3);
        final Map<Integer, Serializable> map2 = new TreeMap<>();
        map.put(5, "abc");
        map.put(2, "sdf");
        map.put(3, new ToCompare(1, "asdf", 3));
        map.put(4, 3);

        final Map<Integer, Serializable> maps = Collections.synchronizedMap(map);
        Collections.unmodifiableMap(map);
    }
}
