//class Point{
//    int x;
//    int y;
//    Point(int x,int y){
//        this.x=x;
//        this.y=y;
//    }
//    public double distance(Point p){
//        int a=this.x;
//        int b=this.y;
//        int c=p.x;
//        int d=p.y;
//        return Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
//
//    }
//    public class Circle{
//        Point center;
//        double radius;
//        Circle(Point center,double radius){
//            this.center=center;
//            this.radius=radius;
//        }
//        void check(Point p){
//            double dist = this.center.distance(p);
//            dist = p.distance(this.center);
//            if(dist < this.radius){
//                System.out.println("inside");
//            }
//            else{
//                System.out.println("outside");
//            }
//
//    }
//}
//}
//
//
//
//
//
//
//public class circle{
//    Point center;
//    double radius;
//
//    circle(Point center, double radius){
//        this.center = center;
//        this.radius = radius;
//    }
//
//    void check(Point p){
//        double dist = this.center.distance(p);
//        if(dist < this.radius){
//            System.out.println("inside");
//        }
//        else{
//            System.out.println("outside");
//        }
//    }
//
//    public static void main(String[] args){
//        Point center=new Point(1,1);
//        double radius=100;
//        circle c=new circle(center,radius);
//        Point p=new Point(10,10);
//        c.check(p);
//
//        Point p1=new Point(5,6);
//        double radius1=10;
//        Point center1=new Point(0,0);
//        circle c1=new circle(center1,radius1);
//        Point p2=new Point(5, 8);
//        c1.check(p2);
//        c1.check(p);
//        c.check(p1);
//    }
//}