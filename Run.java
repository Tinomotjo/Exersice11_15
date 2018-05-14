package Exersice11_15;
import java.util.*;

/*
Write a method maxOccurrences that accepts a list of integers as a parameter and
returns the number of times the most frequently occurring integer (the “mode”) occurs in the list.
Solve this problem using a map as auxiliary storage. If the list is empty, return 0.
*/

public class Run {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(6);
        list.add(6);
        list.add(14);
        list.add(6);
        System.out.println("Det tal som er flest af bliver vist " + maxOccurences(list) + " gange");
    }

    public static int maxOccurences (List<Integer> list){

        Map<Integer, Integer> Map1 = new HashMap<>();
        Iterator<Integer> i = list.iterator();

        while (i.hasNext()) {
            int num = i.next();
            if (Map1.containsKey(num)) {
                Map1.put(num, Map1.get(num) + 1);
            } else {
                Map1.put(num, 1);
            }
        }
        int max = 0;

        for (int count : Map1.values()){
            if (count > max){
                max = count;
            }
        }
        return max;

    }
}