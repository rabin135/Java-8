package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo1 {


    public static void main(String[] args) {


        // declaring list
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6);

        /*
         * Loops are called external iteration
         * -e.g. below
         * loop fetched value outside
         * */

        // printing list traditional way
//        for (Integer i : l) {
//            System.out.println(i);
//        }

        // second way
//        Iterator<Integer> i = l.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }


        // Internal iteration
        // with the help of stream api
        // Stream api -> Java-8
        l.forEach(e -> System.out.println(e));


    }
}
