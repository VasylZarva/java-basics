package com.epom.collections;

import java.util.*;

/**
 * @author Vasyl Zarva.
 */
public class MainCompare {
    private static final Comparator<ToCompare> CUSTOM = new Comparator<ToCompare>() {
        @Override
        public int compare(ToCompare o1, ToCompare o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static void main(String[] args) {
        List<ToCompare> list = new ArrayList<>();
        list.add(new ToCompare(1, "jxc", 2));
        list.add(new ToCompare(2, "txc", 3));
        list.add(new ToCompare(3, "axc", 3));
        list.add(new ToCompare(4, "vova", 5));
        list.add(new ToCompare(5, "vasya", 4));

        printCollection(list);

        Collections.sort(list);

        printCollection(list);

        list.sort(CUSTOM);
        Collections.sort(list, CUSTOM);

        printCollection(list);


    }


    private static void printCollection(final Collection<ToCompare> collection){
        System.out.println("-----------------");
        for (ToCompare elem: collection) {
            System.out.println(elem);
        }
    }
}
