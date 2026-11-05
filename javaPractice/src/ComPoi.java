package javaPractice.src;

import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point> {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {

        if (this.x > p.x) {
            return 1;
        }
        else if (this.x < p.x) {
            return -1;
        }
        else {
            if (this.y > p.y) {
                return -1;
            }
            else if (this.y < p.y) {
                return 1;
            }
        }

        return 0;
    }
}

public class ComPoi {
    public static void main(String[] args) {

        ArrayList<Point> points = new ArrayList<>();

        points.add(new Point(5, 6));
        points.add(new Point(2, 10));
        points.add(new Point(5, 7));

        Collections.sort(points);

        for (Point p : points) {
            System.out.println(p.x + "," + p.y);
        }
    }
}