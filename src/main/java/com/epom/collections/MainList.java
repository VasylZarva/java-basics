package com.epom.collections;

import com.epom.matv.Zakharchuk;

import java.util.*;

/**
 * @author Vasyl Zarva.
 */
public class MainList {


    public static void main(String[] args) {
        // LIST
        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);

        final LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(15);
        linkedList.add(36);
        linkedList.add(48);

        final Stack<Integer> stack = new Stack<>();




        // SET

        final Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(15);
        set.add(36);
        set.add(48);
        set.addAll(list);
//
//        printCollection(set);
//        final Set<Integer> set2 = new HashSet<>(set);
//        printCollection(set2);
//
//
//        final Set<Integer> linkedSet = new LinkedHashSet<>(set2);
//        linkedSet.add(1);
//        linkedSet.add(15);
//        linkedSet.add(3);
//        linkedSet.add(4);
//        linkedSet.add(36);
//        linkedSet.add(48);
//        linkedSet.addAll(list);
//        printCollection(linkedSet);

        // FOREACH --------
//
//        set.forEach(e -> {
//            if (e % 2 == 0)
//                System.out.println(e);
//        });
//
//        for (Integer elem: set) {
//            if (elem % 2 == 0)
//                System.out.println(elem);
//        }

        try {
            for (int i = 0; i < list.size(); i++) {
                Integer elem = list.get(i);
                list.remove(i);
                if (elem % 2 == 0)
                    System.out.println(elem);
            }
        } catch (RuntimeException e) {

        }
        printCollection(set);

        System.out.println("a;lsdkfj;aslkdjf;laksdjf;lkadjs");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer elem = iterator.next();
            if (elem == 48)
                iterator.remove();
        }

        printCollection(set);
    }

    private static void printCollection(final Collection<Integer> collection){
        System.out.println("-----------------");
        for (Integer elem: collection) {
            System.out.println(elem);
        }
    }
}
