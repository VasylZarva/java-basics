package com.epom.collections.practice;

import com.epom.enums.Main;

import java.util.*;

/**
 * @author Vasyl Zarva.
 */
public class Main1 {

    // write method for printing elements in collection
    // write method for printing elements in map
    // add message in print method, if incoming collection null or empty

    public static void main(String[] args) {
        // convert array to list

        String[] array = new String[] {"a", "b", "c", "c", "b", "d", "a", "r"};
        List<String> listString = Arrays.asList(array);
//        printCollection(listString);

        // create list of uniques elements (strings) . initial capacity
//
//        Set<String> listSet = new HashSet<String>(listString);
////        printCollection(listSet);

        // sort this unique list in ascending order (2 ways)
        // sort this unique list in descending order

//        listString.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });

        Collections.sort(listString);

//        printCollection(listString);

        // convert list into array

        String[] strings = (String[]) listString.toArray();

        // iterate over list without loop with index

        Iterator<String> iterator = listString.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        // create list where insert order is matter


        Set<String> simpleSet = new HashSet<>();
        simpleSet.add("as");
        simpleSet.add("dg");
        simpleSet.add("iu");
        simpleSet.add("iu");
        simpleSet.add("fjhm");
        simpleSet.add("y5yt");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("as");
        linkedHashSet.add("dg");
        linkedHashSet.add("iu");
        linkedHashSet.add("iu");
        linkedHashSet.add("fjhm");
        linkedHashSet.add("y5yt");

        printCollection(simpleSet);
        printCollection(linkedHashSet);


        // initialize collection with some values and ensure, that your collection can't be modified in future

        // iterate backward using list iterator

        // find min & max from a list

        //------------

        // create queue list with some integer elements (user random from -50 to 50)

        // split queue into two collections positive and negative values

        // create stack list with some integer elements. print. check difference with queue

        //------------

        // create map with string key and some object value

        final Map<Integer, String> map = new HashMap<>();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
        }

        for (Integer key : map.keySet()) {
            System.out.println("key=" + key);
        }

        for (String value : map.values()) {
            System.out.println("value=" + value);
        }


        // iterate over map entries. print keys/values

        // create map where insert key order is matter

        // retrieve from map list with keys

        // retrieve from map list with values

    }

    public static void printCollection (Collection<String> list){

        System.out.println("=============");
        for(String str: list) {
            System.out.println(str);
        }
    }
}
