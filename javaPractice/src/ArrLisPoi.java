package javaPractice.src;
import java.awt.*;
import java.util.*;
import java.awt.Point;

public class ArrLisPoi {
    public static void main(String[] args){
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(1,2));
        points.add(new Point(5,9));
        points.add(new Point(10,11));

        System.out.println(points.get(0));
       int max=Integer.MIN_VALUE;
        for(int i=0;i<points.size();i++){
            Point p=points.get(i);
            int sum= p.x+p.y+1;
            if(sum>max){
                max=sum;
            }

        }
        System.out.println(max);
    }
}
