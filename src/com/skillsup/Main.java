package com.skillsup;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = {1, 3, 45, 6, -3, 5, -12, 0};
        Iterator<Integer> l = Arrays.asList(arr).iterator();
        var sum = 0;

        while (l.hasNext()) {
            var i = l.next();

            if (i > 0) {
                sum += i;
            }
        }
        double avg = sum / arr.length;

        System.out.println(avg);
    }
}
