package com.lena.learn.exceptions.dima.collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by dmitry on 22.08.17.
 */
public class Maps {

    public static void main(String[] args) {
        HashMap<String, String> map = new LinkedHashMap<String, String>();
        map.put("2", "value33");
        map.put("1", "value55");
        map.put("3", "value22");

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
