package edu.sfsu.cs.datastructures;

import java.util.*;

public class MainPart2 {
//    Using the same Data.users array. You are asked to perform the following tasks:
//            1.  Your implementation for this question should be included in MainPart1.java file.
//            2.  The goal is to count the number of users living each state. Print out the list of State,
//    Count order in ascending order by count.

    public static void main(String[] args) {

        HashMap<String, Integer> stateCount = new HashMap<String, Integer>();

        for (String str : edu.sfsu.cs.datastructures.Data.users) {
            String stateFields[] = str.split(",");
            String state = stateFields[stateFields.length - 1].trim().toUpperCase();
            if(stateCount.containsKey(state)){
                stateCount.put(state, stateCount.get(state) + 1);
            }
            else
                stateCount.put(state, 1);
        }

        LinkedHashMap<String, Integer> ascendingStateNumbers = new LinkedHashMap<>();
        stateCount.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> ascendingStateNumbers.put(x.getKey(), x.getValue()));

        System.out.println("Number of Users Living in each State: " + ascendingStateNumbers);

    }
}
