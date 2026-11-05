class Shape {
    int length;
    int width;
    int height;

    Shape() {
        this.length = 10;
        this.width = 10;
        this.height = 10;
    }

    Shape(int length, int height) {
        this.length = length;
        this.height = height;
        this.width = 0;
    }

    Shape(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Shape(Shape s) {
        this.length = s.length;
        this.height = s.height;
        this.width = s.width;
    }
}

class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape(5, 10);
        System.out.println(shape2.length);
        System.out.println(shape2.height);
        System.out.println(shape2.width);

        Shape shape3 = new Shape(3, 6, 9);
        Shape shape4 = new Shape(shape3);
        System.out.println(shape4.length);
        System.out.println(shape4.height);
        System.out.println(shape4.width);


    }
}