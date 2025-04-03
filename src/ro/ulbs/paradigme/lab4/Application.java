package ro.ulbs.paradigme.lab4;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList(); //d

        for (int i = 0; i < 5; i++) {
            int n = (int) Math.floor(Math.random() * 10);
            while (x.contains(n)) {
                n = (int) Math.floor(Math.random() * 10);
            }
            x.add(n);
        }
        for (int i = 0; i < 7; i++) {
            int n = (int) Math.floor(Math.random() * 10);
            while (y.contains(n)) {
                n = (int) Math.floor(Math.random() * 10);
            }
            y.add(n);
        }
        x.sort(Integer::compareTo);
        System.out.println("x: " + x);
        y.sort(Integer::compareTo);
        System.out.println("y: " + y);

        xPlusY.addAll(x);
        for (Integer i : y) {
            if (! xPlusY.contains(i)) {
                xPlusY.add(i);
            }
        }
        System.out.println("xPlusY: " + xPlusY);

        for (Integer i : x) {
            if (y.contains(i)) {
                zSet.add(i);
            }
        }
        System.out.println("zSet: " + zSet);

        for (Integer i : x) {
            if (!y.contains(i)) {
                xMinusY.add(i);
            }
        }
        System.out.println("xMinusY: " + xMinusY);

        for (Integer i : xPlusY) {
            if (i <= p) {
                xPlusYLimitedByP.add(i);
            }
        }
        System.out.println("xPyLz: " + xPlusYLimitedByP);
    }
}
