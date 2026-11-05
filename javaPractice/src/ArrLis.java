package javaPractice.src;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

import java.util.ArrayList;
import java.awt.Point;
import java.util.Collections;

public class ArrLis {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        int element= list.get(3);
        System.out.println(element);

        list.add(2 , 6);
        System.out.println(list);

        list.set(1 , 8);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
       int size= list.size();
        System.out.println(size);


        for(int i=0;i<list.size();i++){
            System.out.println( list.get(i));
        }

        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        for(int x : list){
            System.out.println(x);
        }

    }
}